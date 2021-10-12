package com.xworkz.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection connection = null;
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiles", "root", "Tanvir@123");
			System.out.println("connection is sucessful ");
			System.out.println("connection is singleton");
		}catch(SQLException exception){
    	    exception.printStackTrace();
    }
	}
public static Connection getConnection() {	
	System.out.println("invoked getconnection()");
	if (connection!=null) {
		return connection;
	}else {
		System.out.println("connection is not created");
		return connection;
	}
	}
public static void closeconnection() {
	System.out.println("connection is closed");
}
}