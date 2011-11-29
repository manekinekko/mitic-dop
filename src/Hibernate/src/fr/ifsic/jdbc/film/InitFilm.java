package Hibernate.src.fr.ifsic.jdbc.film;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Hibernate.src.fr.ifsic.jdbc.MysqlDataSource;

public class InitFilm extends MysqlDataSource {

	public InitFilm() {
		super("10006926","alacarte");
	}
	
	public InitFilm(String user, String password) {
		super(user, password);
	}

	public InitFilm(String databaseName, String user, String password, String serverName, String port) {
		super(databaseName, user, password, serverName, port);
	}


	protected Connection con;

	private static final String CREATE_FILM = "create table film"
			+ "(f        int unsigned not null auto_increment primary key,"
			+ "titre     varchar(25) not null," 
			+ "annee     varchar(4),"
			+ "p_rea     int unsigned not null," 
			+ "constraint Foreign key(p_rea) references personne(p),"
			+ "genre     varchar(15),"
			+ "duree     varchar(3)" + ")";

	private static final String CREATE_PERSONNE = "create table personne"
			+ "(p        int unsigned not null auto_increment primary key,"
			+ "nom       varchar(12) not null," 
			+ "prenom    varchar(12),"
			+ "sexe      varchar(1)" + ")";

	private static final String CREATE_VEDETTE = "create table vedette"
			+ "(f        int unsigned not null,"
			+ "constraint Foreign Key(f) references film(f),"
			+ "p         int unsigned not null,"
			+ "constraint foreign key(p) references personne(p),"
			+ "constraint primary key(f,p),"
			+ "role      varchar(25)" + ")";

	private static final String CREATE_ACTEUR = "create table acteur"
			+ "(p         int unsigned not null primary key,"
			+ "nb_film   varchar(3),"
			+ "constraint foreign key(p) references personne(p)" + ")";

	public static void main(String[] args) {
		InitFilm film = new InitFilm();
		film.init();

	}

	public void init() {
		con = getConnection();
		
		try {
			initTables();
			showTables(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	public void initTables() throws SQLException {
		Statement stmt = con.createStatement();

		try {
			stmt.executeUpdate("drop table personne");
		} catch (SQLException e) {}
		addPersonneTuples();

		try {
			stmt.executeUpdate("drop table film");
		} catch (SQLException e) {}
		addFilmTuples();

		try {
			stmt.executeUpdate("drop table vedette");
		} catch (SQLException e) {}
		addVedetteTuples();

		try {
			stmt.executeUpdate("drop table acteur");
		} catch (SQLException e) {}
		addActeurTuples();
		stmt.close();
	}

	private void addActeurTuples() throws SQLException {
		final String INSERT_INTO = "insert into acteur values";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(CREATE_ACTEUR);
		stmt.executeUpdate(INSERT_INTO + "('1',80)");
		stmt.executeUpdate(INSERT_INTO + "('2',52)");
		stmt.executeUpdate(INSERT_INTO + "('3',23)");
		stmt.executeUpdate(INSERT_INTO + "('4',44)");
		stmt.executeUpdate(INSERT_INTO + "('5',39)");
		stmt.executeUpdate(INSERT_INTO + "('6',47)");
		stmt.executeUpdate(INSERT_INTO + "('7',51)");
		stmt.executeUpdate(INSERT_INTO + "('8',25)");
		stmt.executeUpdate(INSERT_INTO + "('20',9)");
		stmt.executeUpdate(INSERT_INTO + "('22',57)");
		stmt.executeUpdate(INSERT_INTO + "('23',8)");
		stmt.close();
	}

	private void addPersonneTuples() throws SQLException {
		final String INSERT_INTO = "insert into personne (nom,prenom,sexe) values";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(CREATE_PERSONNE);
		stmt.executeUpdate(INSERT_INTO + "('DEPARDIEU','GERARD','M')");
		stmt.executeUpdate(INSERT_INTO + "('RICHARD','PIERRE','M')");
		stmt.executeUpdate(INSERT_INTO + "('KEATON','DIANE','F')");
		stmt.executeUpdate(INSERT_INTO + "('ALLEN','WOODY','M')");
		stmt.executeUpdate(INSERT_INTO + "('MARCEAU','SOPHIE','F')");
		stmt.executeUpdate(INSERT_INTO + "('HUPPERT','ISABELLE','F')");
		stmt.executeUpdate(INSERT_INTO + "('FORD','HARRISON','M')");
		stmt.executeUpdate(INSERT_INTO + "('BINOCHE','JULIETTE','F')");
		stmt.executeUpdate(INSERT_INTO + "('ZUCKER','JERRY','M')");
		stmt.executeUpdate(INSERT_INTO + "('VEBER','FRANCIS','M')");
		stmt.executeUpdate(INSERT_INTO + "('POIRE','JEAN MARIE','M')");
		stmt.executeUpdate(INSERT_INTO + "('HITCHCOCK','ALFRED','M')");
		stmt.executeUpdate(INSERT_INTO + "('PIALAT','MAURICE','M')");
		stmt.executeUpdate(INSERT_INTO + "('DAVIS','ANDREW','M')");
		stmt.executeUpdate(INSERT_INTO + "('WEIR','PETER','M')");
		stmt.executeUpdate(INSERT_INTO + "('RAPPENEAU','JEAN PAUL','M')");
		stmt.executeUpdate(INSERT_INTO + "('KIESLOWSKI','KRZYSZTOF','M')");
		stmt.executeUpdate(INSERT_INTO + "('CHABROL','CLAUDE','M')");
		stmt.executeUpdate(INSERT_INTO + "('CORNEAU','ALAIN','M')");
		stmt.executeUpdate(INSERT_INTO + "('DEPARDIEU','GUILLAUME','M')");
		stmt.executeUpdate(INSERT_INTO + "('LYNCH','DAVID','M')");
		stmt.executeUpdate(INSERT_INTO + "('FARNSWORTH','RICHARD','M')");
		stmt.executeUpdate(INSERT_INTO + "('SPACEK','SISSY','F')");
		stmt.executeUpdate(INSERT_INTO + "('STANTON','HARRY DEAN','M')");
		stmt.executeUpdate(INSERT_INTO + "('CONNERY','SEAN','M')");
		stmt.executeUpdate(INSERT_INTO + "('GERE','RICHARD','M')");
		stmt.close();
	}

	private void addVedetteTuples() throws SQLException {
		final String INSERT_INTO = "insert into vedette values";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(CREATE_VEDETTE);
		stmt.executeUpdate(INSERT_INTO + "('1','25','LE ROI ARTHUR')");
		stmt.executeUpdate(INSERT_INTO + "('1','26','LANCELOT')");
		stmt.executeUpdate(INSERT_INTO + "('2','1','LE PERE COSTAUD')");
		stmt.executeUpdate(INSERT_INTO + "('2','2','LE PERE DEPRESSIF')");
		stmt.executeUpdate(INSERT_INTO + "('3','4','LE MALADE')");
		stmt.executeUpdate(INSERT_INTO + "('5','1','LE FONCEUR')");
		stmt.executeUpdate(INSERT_INTO + "('5','2','LE MALCHANCEUX')");
		stmt.executeUpdate(INSERT_INTO + "('7','4','LARRY')");
		stmt.executeUpdate(INSERT_INTO + "('7','3','CAROL')");
		stmt.executeUpdate(INSERT_INTO + "('10','1','LE FLIC')");
		stmt.executeUpdate(INSERT_INTO + "('10','5','NORIA')");
		stmt.executeUpdate(INSERT_INTO + "('11','7','DOCTEUR KIMBLE')");
		stmt.executeUpdate(INSERT_INTO + "('12','7','JOHN BOOK')");
		stmt.executeUpdate(INSERT_INTO + "('13','8','PAULINE')");
		stmt.executeUpdate(INSERT_INTO + "('14','6','NELLY')");
		stmt.executeUpdate(INSERT_INTO + "('14','1','LOULOU')");
		stmt.executeUpdate(INSERT_INTO + "('15','8','JULIE')");
		stmt.executeUpdate(INSERT_INTO + "('16','6','LA POSTIERE')");
		stmt.executeUpdate(INSERT_INTO + "('17','1','MARIN MARAIS ADULTE')");
		stmt.executeUpdate(INSERT_INTO + "('17','20','MARIN MARAIS JEUNE')");
		stmt.executeUpdate(INSERT_INTO + "('18','22','ALVIN')");
		stmt.executeUpdate(INSERT_INTO + "('18','23','SOEUR D ALVIN')");
		stmt.executeUpdate(INSERT_INTO + "('18','24','FRERE D ALVIN')");
		stmt.close();
	}

	private void addFilmTuples() throws SQLException {
		final String INSERT_INTO = "insert into film (titre,annee,p_rea,genre,duree) values";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(CREATE_FILM);
		stmt.executeUpdate(INSERT_INTO
				+ "( 'LANCELOT',1995,'9','LEGENDES',133)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LES COMPERES',1983,'10','COMEDIE PSYCHO.',104)");
		stmt.executeUpdate(INSERT_INTO
				+ "('HANNAH ET SES SOEURS',1986,'4','COMEDIE PSYCHO.',100)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LES VISITEURS',1993,'11','COMEDIE HISTOR.',105)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LA CHEVRE',1981,'10','COMEDIE',92)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LA ROSE POURPRE DU CAIRE',1984,'4','COMEDIE',82)");
		stmt.executeUpdate(INSERT_INTO
				+ "('MANHATTAN MURDER MYSTERY',1993,'4','COMEDIE POLIC.',108)");
		stmt.executeUpdate(INSERT_INTO
				+ "('SUEURS FROIDES',1958,'12','POLICIER',128)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LA MORT AUX TROUSSES',1959,'12','POLICIER',136)");
		stmt.executeUpdate(INSERT_INTO
				+ "('POLICE',1985,'13','DRAME POLICIER',113)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LE FUGITIF',1993,'14','DRAME POLICIER',130)");
		stmt.executeUpdate(INSERT_INTO
				+ "('WITNESS',1985,'15','DRAME POLICIER',115)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LE HUSSARD SUR LE TOIT',1995,'16','DRAME HISTOR.',135)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LOULOU',1980,'13','DRAME',110)");
		stmt.executeUpdate(INSERT_INTO
				+ "('TROIS COULEURS : BLEU',1993,'17','DRAME',100)");
		stmt.executeUpdate(INSERT_INTO
				+ "('LA CEREMONIE',1995,'18','DRAME',111)");
		stmt.executeUpdate(INSERT_INTO
				+ "('TOUS LES MATINS DU MONDE',1991,'19','COMEDIE DRAM.',114)");
		stmt.executeUpdate(INSERT_INTO
				+ "('UNE HISTOIRE VRAIE',1999,'21','COMEDIE DRAM.',111)");
		stmt.close();
	}

}
