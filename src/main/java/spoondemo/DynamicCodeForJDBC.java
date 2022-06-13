package spoondemo;
package net.codejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;


public class DynamicCodeForJDBC {
    String dbURL1 = "jdbc:postgresql:ProductDB1?user=root&password=secret";
    Connection conn = DriverManager.getConnection(dbURL1);
	
	static final String query2 = "from table2";
	static final String query3 = "id,name";
	static final String query1 = "SELECT";

	public void getQuery() {
		
		String query1 = "from table2";		
		String query2 = "id,name";
		String query3 = "SELECT";
		
		String Final = query3 + query2 + query1;
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(Final);
		
	}
	
	
	public void execute() {
		String query1 = "select id,name from table2";
	}
}