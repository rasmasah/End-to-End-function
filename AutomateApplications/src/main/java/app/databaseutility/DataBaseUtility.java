package app.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver; 

public class DataBaseUtility {
	Connection conn;
	public void getDbconnection(String url, String username, String password) throws SQLException {
		try { 
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 conn =DriverManager.getConnection(url,username,password);
	}
		catch(Exception e) {
	}
	}
	public void closeDbconnection() throws SQLException {
		try {
		conn.close();
	}catch (Exception e) {
		
	}
	}
	public ResultSet executeselectquery(String query) {
		ResultSet result=null;
		try {
		Statement stat=conn.createStatement();
		result=stat.executeQuery(query);
	}
		catch(Exception e) {
}
		return result;
	}
	public int executenonselectQuery(String query) {
		int result=0;
		try {
			Statement stat=conn.createStatement();
			 result=stat.executeUpdate(query);	
		}catch (Exception e) {
	}
		return result;
}
	//no need
	public void getDbconnection() {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			Connection conn=DriverManager.getConnection("jdbc:mysql:http://49.249.28.218:8081/AppServer/Hospital_Management_System/","admin","test@12345");
		}
		catch(Exception e) {
		}
		}
	}

