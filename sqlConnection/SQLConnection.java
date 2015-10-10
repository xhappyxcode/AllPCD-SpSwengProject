package sqlConnection;

import java.sql.*;

public class SQLConnection {
	private static Connection con;
	private static PreparedStatement ppStmnt;
	private static Statement stmnt;
	private static SQLConnection conn;
	
	private SQLConnection(){
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root", "p@ssword");
		} catch (SQLException e) {
			System.out.println("constructor: driver manager error, cannot connect");
			e.printStackTrace();
		}
	}
	
	//SQL basic operations
	public static ResultSet executeQuery(String query){
		ResultSet rs = null;
		try {
			stmnt = con.createStatement();
			rs = stmnt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("executeQuery: query not returned");
			e.printStackTrace();
		}
		return rs;
	}
	
	//Singleton mode!!!
	public static SQLConnection getInstance(){
		if(conn == null)
			conn = new SQLConnection();
		return conn;
	}
}
