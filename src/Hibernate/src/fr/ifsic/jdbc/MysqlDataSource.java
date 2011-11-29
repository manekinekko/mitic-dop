
package Hibernate.src.fr.ifsic.jdbc;


public class MysqlDataSource extends DataSource {
	
	// Pour un utilisateur xxx
	// l'url � l'IFSIC est : jdbc:mysql://anteros.ifsic.univ-rennes1.fr:3306/base_xxx
	// le nom de sa base est base_xxx
	// son nom d'utilisateurs est user_xxx
	
	// les mots de passe sont choisis par les utilisateurs et 
	// doivent �tre donn�s en utilisant l'interface d'administration mysql
	public MysqlDataSource(String userId, String password) {
		super("base_"+userId, "user_"+userId, password, "anteros.ifsic.univ-rennes1.fr", "3306");
		this.driver = "org.gjt.mm.mysql.Driver";
	}
	
	public MysqlDataSource(String databaseName, String user, String password,
			String serverName, String port) {
		super(databaseName, user, password, serverName, port);
		this.driver = "org.gjt.mm.mysql.Driver";
	}
	
	protected String buildUrl(String serverName, String port, String databaseName) {
		StringBuffer result = new StringBuffer("jdbc:mysql://")
			.append(serverName).append(":").append(port).append("/")
			.append(databaseName);
		return result.toString();
	}
}
