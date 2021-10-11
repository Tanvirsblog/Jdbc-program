package com.xworkz.mobile.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MobileDAOImpl implements MobileDAO{

	@Override
	public void saveMobileRecord() {
		System.out.println("invoked save MobileRecord");
		String url ="jdbc:mysql://localhost:3306/mobiles";
		String userName = "root";
		String password = "Tanvir@123";
		String insertQuery ="INSERT INTO mobile_details VALUE(2,'Oppo','Black','4GB',21999)";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
		}catch (Exception exception) {
			exception.printStackTrace();
		} finally {
		 try {
			if(connection!=null) {
			   connection.close();
			
			   System.out.println("conection is closed");
		} else {
		       System.out.println("connection is not closed");
			   }
        } catch (SQLException exception) {
				exception.printStackTrace();
			}
			}

	}
	
	@Override
	public void updateBrand() {
        System.out.println("invoked update MobileRecord");
		String url ="jdbc:mysql://localhost:3306/mobiles";
		String userName = "root";
		String password = "Tanvir@123";
		String updateQuery ="UPDATE  mobile_details SET COLOR='GRAY' WHERE ID = 2";
	    Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
		}catch (Exception exception) {
				exception.printStackTrace();
		} finally {
	    try {
			if(connection!=null) {
			   connection.close();
			   System.out.println("conection is closed");
		} else {
		       System.out.println("connection is not closed");
			   }
        } catch (SQLException exception) {
				exception.printStackTrace();
			}
			}

	}

	@Override
	public void updateBrandAndPrice() {
        System.out.println("invoked updateBrandAndPrice MobileRecord");
		String url ="jdbc:mysql://localhost:3306/mobiles";
		String userName = "root";
		String password = "Tanvir@123";
		String updateQuery ="UPDATE  mobile_details SET BRAND='Oneplus' WHERE ID = 2";
	    Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
		}catch (Exception exception) {
				exception.printStackTrace();
		} finally {
		try {
			if(connection!=null) {
			   connection.close();
			   System.out.println("conection is closed");
		} else {
		       System.out.println("connection is not closed");
			   }
        } catch (SQLException exception) {
				exception.printStackTrace();
			}
			}

	}
		
	
		
	@Override
	public void readSingleRecordById() {
		System.out.println("readSingleRecordById MobileRecord");
		String url ="jdbc:mysql://localhost:3306/mobiles";
		String userName = "root";
		String password = "Tanvir@123";
		String readSigleRecordById ="SELECT*FROM Mobile_details WHERE ID=1";
	    Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
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
	   } finally {
	     try {
			if(connection!=null) {
			   connection.close();
			System.out.println("conection is closed");
		} else {
		    System.out.println("connection is not closed");
			   }
        } catch (SQLException exception) {
				exception.printStackTrace();
			}
			}
 }	
	

	@Override
	public void readAllRecord() {
        System.out.println("readAllRecordById MobileRecord");
		String url ="jdbc:mysql://localhost:3306/mobiles";
		String userName = "root";
		String password = "Tanvir@123";
		String readAllRecord ="SELECT*FROM Mobile_details";
	    Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllRecord);
			resultSet.next();
			System.out.println("id"+ resultSet.getInt(1));
			System.out.println("brand"+ resultSet.getString(2));
			System.out.println("color"+ resultSet.getString(3));
			System.out.println("ram"+ resultSet.getString(4));
			System.out.println("price"+ resultSet.getDouble(5));
			System.out.println("record All read by id");
		}catch (Exception exception) {
				exception.printStackTrace();
		} finally {
		 try {
			if(connection!=null) {
			   connection.close();
			   System.out.println("conection is closed");
		} else {
		       System.out.println("connection is not closed");
			   }
        } catch (SQLException exception) {
				 exception.printStackTrace();
			}
			}
 }	
		

	@Override
	public void readMobilePriceById() {
		 System.out.println("readMobilePriceById MobileRecord");
			String url ="jdbc:mysql://localhost:3306/mobiles";
			String userName = "root";
			String password = "Tanvir@123";
			String readMobilePriceById ="SELECT PRICE FROM Mobile_details WHERE ID = 2";
		    Connection connection = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			    connection =DriverManager.getConnection(url, userName, password);
				System.out.println("connection is successful " +url);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(readMobilePriceById);
				resultSet.next();
				System.out.println("price"+ resultSet.getDouble(1));
				System.out.println("Price  read by id");
		}catch (Exception exception) {
					exception.printStackTrace();
		} finally {
		 try {
			if(connection!=null) {
			   connection.close();
			   System.out.println("conection is closed");
		} else {
			    System.out.println("connection is not closed");
				   }
	    } catch (SQLException exception) {
				exception.printStackTrace();
				}
				}
	 }		


	@Override
	public void readMobileBrandById() {
	     System.out.println("readMobileBrandById ");
		 String url ="jdbc:mysql://localhost:3306/mobiles";
		 String userName = "root";
		 String password = "Tanvir@123";
		 String readMobileBrandById ="SELECT*FROM Mobile_details WHERE ID = 2";
		 Connection connection = null;
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     connection =DriverManager.getConnection(url, userName, password);
		 System.out.println("connection is successful " +url);
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery(readMobileBrandById);
		 resultSet.next();
		 System.out.println("brand"+ resultSet.getString(1));
		 System.out.println("brand read by id");
	}catch (Exception exception) {
			exception.printStackTrace();
	} finally {
	 try {
		 if(connection!=null) {
		    connection.close();
		    System.out.println("conection is closed");
	} else {
		   System.out.println("connection is not closed");
		   }
    } catch (SQLException exception) {
		     exception.printStackTrace();
				}
				}
	 }		
		

	@Override
	public void readMobileColorById() {
		System.out.println("readMobileColorById MobileRecord");
	    String url ="jdbc:mysql://localhost:3306/mobiles";
		String userName = "root";
		String password = "Tanvir@123";
		String readMobileColorById ="SELECT*FROM Mobile_details WHERE ID = 2";
		Connection connection = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    connection =DriverManager.getConnection(url, userName, password);
		System.out.println("connection is successful " +url);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(readMobileColorById);
		resultSet.next();
		System.out.println("color"+ resultSet.getString(1));
		System.out.println("color read by id");
	}catch (Exception exception) {
			exception.printStackTrace();
	} finally {
	 try {
		if(connection!=null) {
		   connection.close();
		   System.out.println("conection is closed");
	} else {
		   System.out.println("connection is not closed");
		   }
    } catch (SQLException exception) {
			exception.printStackTrace();
			}
			}
 }			
	@Override
	public void deleteMobileById() {
		 System.out.println("delete MobileById MobileRecord");
		 String url ="jdbc:mysql://localhost:3306/mobiles";
		 String userName = "root";
		 String password = "Tanvir@123";
		 String deleteQuery ="DELETE FROM mobile_details WHERE ID = 2 ";
		 Connection connection = null;
	try {
	     Class.forName("com.mysql.cj.jdbc.Driver");
		 connection =DriverManager.getConnection(url, userName, password);
		 System.out.println("connection is successful " +url);
		 Statement statement = connection.createStatement();
		 statement.executeUpdate(deleteQuery);
	}catch (Exception exception) {
			exception.printStackTrace();
	} finally {
	 try {
		 if(connection!=null) {
		    connection.close();
		    System.out.println("conection is closed");
	} else {
			System.out.println("connection is not closed");
		    }
    } catch (SQLException exception) {
			exception.printStackTrace();
				}
				}
		}
}
	

