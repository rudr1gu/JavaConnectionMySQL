package eteczl.BancodeDados.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	

	private String host;
	private String port;
	private String dbname;
	private String dbuser;
	private String dbpass;
	
	public Conexao(String host, String port, String n, String u, String p) {
		this.host = host;
		this.port = port;
		this.dbname = n;
		this.dbuser = u;
		this.dbpass = p;
	}
	
	public Connection getConnection() {
		String strConn = "jdbc:mysql://"+this.host+":"+this.port+"/"+this.dbname;
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(strConn, this.dbuser, this.dbpass);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	

}
