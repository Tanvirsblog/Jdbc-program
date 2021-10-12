package com.xworkz.mobilewithstatickey.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.util.ConnectionProvider;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void savaMobileRecord() {
		System.out.println("invoked save mobile record");
		String insertQuery ="INSERT INTO mobile_details VALUE(2,'Oppo','Black','4GB',21999)";
		Connection connection = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection  = ConnectionProvider.getConnection();
				Statement statement = connection.createStatement();
				statement.executeUpdate(insertQuery);
				System.out.println("New line inserted");
		} catch (SQLException exception) {
			     exception.printStackTrace();
		}

		}
		
	@Override
	public void radAllRecord() {
		System.out.println("invoked reads single record by id");
		String readSingleRecordById ="SELECT*FROM Mobile_details WHERE ID=1";
		try {
			Connection connection = ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readSingleRecordById);
			resultSet.next();
			System.out.println("id"+ resultSet.getInt(1));
			System.out.println("brand"+ resultSet.getString(2));
			System.out.println("color"+ resultSet.getString(3));
			System.out.println("ram"+ resultSet.getString(4));
			System.out.println("price"+ resultSet.getDouble(5));
			System.out.println("Single line record read by id");
	   }catch (Exception exception) {
			   exception.printStackTrace();
	   }	
	}

		


	@Override
	public void updateBrand() {
		System.out.println("invoked updateBrandAndPrice MobileRecord");
		String updateQuery ="UPDATE  mobile_details SET BRAND='Oneplus' WHERE ID = 2";
	    Connection connection = null;
		try {
			connection=ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
		}catch (Exception exception) {
				exception.printStackTrace();
		}
		
	}

	@Override
	public void updateBrandAndPrice() {
		System.out.println("readMobileBrandById ");
		String readMobileBrandById ="SELECT*FROM Mobile_details WHERE ID = 2";
		Connection connection = null;
	try {
		 connection=ConnectionProvider.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery(readMobileBrandById);
		 resultSet.next();
		 System.out.println("brand"+ resultSet.getString(1));
		 System.out.println("brand read by id");
	}catch (Exception exception) {
			exception.printStackTrace();
	}
		
	}

	@Override
	public void readSingleRecordById() {
		System.out.println("readSingleRecordById MobileRecord");
		String readSigleRecordById ="SELECT*FROM Mobile_details WHERE ID=1";
	    Connection connection = null;
		try {
			connection=ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readSigleRecordById);
			resultSet.next();
			System.out.println("id"+ resultSet.getInt(1));
			System.out.println("brand"+ resultSet.getString(2));
			System.out.println("color"+ resultSet.getString(3));
			System.out.println("ram"+ resultSet.getString(4));
			System.out.println("price"+ resultSet.getDouble(5));
			System.out.println("Single line record read by id");
	   }catch (Exception exception) {
			   exception.printStackTrace();
	   }
		
	}

	
	@Override
	public void readMobilePriceById() {
		System.out.println("readMobilePriceById MobileRecord");
		String readMobilePriceById ="SELECT PRICE FROM Mobile_details WHERE ID = 2";
	    Connection connection = null;
	try {
		connection=ConnectionProvider.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(readMobilePriceById);
		resultSet.next();
		System.out.println("price"+ resultSet.getDouble(1));
		System.out.println("Price  read by id");
	}catch (Exception exception) {
			exception.printStackTrace();
	}
	}

	@Override
	public void readMobileBrandById() {
		System.out.println("readMobileBrandById ");
		String readMobileBrandById ="SELECT*FROM Mobile_details WHERE ID = 2";
		Connection connection = null;
	try {
		 connection=ConnectionProvider.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery(readMobileBrandById);
		 resultSet.next();
		 System.out.println("brand"+ resultSet.getString(1));
		 System.out.println("brand read by id");
	}catch (Exception exception) {
			exception.printStackTrace();
	}
	}

	@Override
	public void readMobileColorById() {
		System.out.println("readMobileColorById MobileRecord");
	   	String readMobileColorById ="SELECT*FROM Mobile_details WHERE ID = 2";
		Connection connection = null;
	try {
		connection=ConnectionProvider.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(readMobileColorById);
		resultSet.next();
		System.out.println("color"+ resultSet.getString(1));
		System.out.println("color read by id");
	}catch (Exception exception) {
			exception.printStackTrace();
	}
	}
	@Override
	public void deleteMobileRecordById() {
		System.out.println("delete MobileById MobileRecord");
		 String deleteQuery ="DELETE FROM mobile_details WHERE ID = 2 ";
		 Connection connection = null;
	try {
		 connection=ConnectionProvider.getConnection();
	   	 Statement statement = connection.createStatement();
		 statement.executeUpdate(deleteQuery);
	}catch (Exception exception) {
			exception.printStackTrace();
	}
	}
}
	


			 
	


