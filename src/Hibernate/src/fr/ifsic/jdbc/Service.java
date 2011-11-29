package Hibernate.src.fr.ifsic.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {

	public static void affiche(ResultSet resultat) throws SQLException {
		int i;
		ResultSetMetaData rs = resultat.getMetaData();
		int nbcol = rs.getColumnCount();
	
		for (i = 1; i <= nbcol; i++) {
	
			if (i > 1)
				System.out.print("\t");
			System.out.print(rs.getColumnLabel(i));
		}
		System.out.println(""); // ligne suivante
		while (resultat.next()) {
			for (i = 1; i <= nbcol; i++) {
				if (i > 1)
					System.out.print("\t");
				System.out.print(resultat.getString(i));
			}
			System.out.println(""); // ligne suivante
		}
	}
		
	public static void afficherTables(Connection con) throws SQLException {
		ResultSet rs;
		Statement stmt = null;		
		try {
		// afficher les tables
		stmt = con.createStatement();
		
		System.out.println("\n*********** les tables ***************");
		String[] types = { "table" };
		DatabaseMetaData meta = con.getMetaData();
		rs = meta.getTables(null, null, "%", types);
		Service.affiche(rs);

		rs = meta.getTables(null, null, "%", types);
		while (rs.next()) {
			String tableName = rs.getString(3);
			System.out.println("\n*********** "+tableName+" ***************");
			ResultSet resultat = stmt.executeQuery("select * from "+tableName);
			Service.affiche(resultat);
		}
		} finally {
			if (stmt != null) stmt.close();
		}
	}

	
	/* remove leading whitespace */
	public static String ltrim(String source) {
		return source.replaceAll("^s+", "");
	}

	/* remove trailing whitespace */
	public static String rtrim(String source) {
		return source.replaceAll("s+$", "");
	}

	/* replace multiple whitespaces between words with single blank */
	public static String itrim(String source) {
		return source.replaceAll("bs{2,}b", " ");
	}

	/* remove all superfluous whitespaces in source string */
	public static String trim(String source) {
		return itrim(ltrim(rtrim(source)));
	}

	public static String lrtrim(String source){
		return ltrim(rtrim(source));
	}

}
