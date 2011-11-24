package JDBC;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import com.mysql.jdbc.PreparedStatement;

import JDBC.fr.ifsic.epicerie.Epicerie;
import JDBC.fr.ifsic.epicerie.Fournisseur;
import JDBC.fr.ifsic.epicerie.InitEpicerieException;

public class TestEpicerie {
	
	public static Connection conn;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			String url = "jdbc:mysql://anteros.istic.univ-rennes1.fr:3306/base_10006926";
			conn = DriverManager.getConnection(url, "user_10006926","alacarte");
			
			
			Statement stmt = conn.createStatement();
			String creerTables1 = "create table if not exists fournisseur (" +
									"f int unsigned not null auto_increment primary key," +
									"nom varchar(25) not null," +
									"remise float(24)," +
									"ville varchar(20) " +
								")";
			String creerTables2 = "create table if not exists produit (" +
									"p int unsigned not null auto_increment primary key," +
									"nom varchar(25) not null," +
									"couleur varchar(25)," +
									"origine varchar(20) " +
								")";
			String creerTables3 = "create table if not exists mafourniture (" +
									"f int unsigned not null," +
									"constraint Foreign Key(f) references fournisseur(f)," +
									"p int unsigned not null," +
									"constraint Foreign key(p) references produit(p)," +
									"constraint Primary Key(f,p)," +
									"qte int unsigned" +
								")";
			
			stmt.executeUpdate(creerTables1);
			stmt.executeUpdate(creerTables2);
			stmt.executeUpdate(creerTables3);

			Epicerie fournisseur = new Epicerie();
			Fournisseur[] ft = fournisseur.getLesFournisseurs();
			Fournisseur fn = null;
			PreparedStatement ps = null;
			for( int i=0; i<ft.length; i++ ){
				fn = ft[i];
				ps.addBatch(" insert into fournisseur values (?,?,?,?) ");
				ps.setInt(0, Integer.parseInt(fn.getF().substring(1)));
				ps.setString(1, fn.getNom());
				ps.setFloat(2, fn.getRemise().floatValue());
				ps.setString(3, fn.getVille());
			}
			
			boolean res = ps.execute();
			System.out.println("Res: "+ res );
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InitEpicerieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
