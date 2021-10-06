package com.xworkz.jdbc;

	import java.sql.*;

	public class Laptop{
		
		public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/mobiles";
			String userName ="root"; 
			String password ="Tanvir@123"; 
			String sqlQuery = "INSERT INTO mobile_details VALUE(1,'Vivo','Black','4GB',19999)";
			String updateQuery = "UPDATE mobile_details SET COLOR='SILVER' WHERE ID=1";
			//String insertQuery = "INSERT INTO mobile_details VALUE(2,'Oppo','Black','4GB',19999)";
			String deleteQuery = "DELETE FROM mobile_details WHERE ID=2";
			String insertQuery = "INSERT INTO mobile_details VALUE(2,'Mi','Gray','4GB',21999)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection =DriverManager.getConnection(url, userName, password);
				System.out.println("connection is successful " +url);
				Statement statement = connection.createStatement();
				statement.executeUpdate(insertQuery);
				System.out.println(" new row is inserted");
				
			}
			catch (SQLException sqlException) {
				
				
			} 
			catch (ClassNotFoundException classNotFoundException) {
				
				classNotFoundException.printStackTrace();
			}
		}
	}

