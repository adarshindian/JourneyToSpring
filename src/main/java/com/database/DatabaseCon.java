package com.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseCon {

    protected static Connection initializeDatabase()
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
    	
    	  String dbDriver = "com.mysql.cj.jdbc.Driver"; 
	        String dbURL = "jdbc:mysql:// localhost:3306/"; 
	        // Database name to access 
	        String dbName = "Customer"; 
	        String dbUsername = "root"; 
	        String dbPassword = "Madhav@123"; 
  
        Class.forName(dbDriver); 

        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
    } 
} 