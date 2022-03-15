package com.example.demo.dAOImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
@Component
public class DBConnection {

Connection connection;
	
	public Connection getconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buynow","root","root");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();}
		catch(SQLException s) {s.printStackTrace();}
		return connection;
		}
	
	public void closeConnection() {
		try {
			if(connection !=null) {
				connection.close();
			}}
			catch(SQLException sqle) {sqle.printStackTrace();}
}
}
