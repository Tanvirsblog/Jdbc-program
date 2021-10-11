package com.xworkz.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOImpl;

public class MobileTester {
	public static void main(String[] args) throws SQLException {
		
	
		MobileDAO mobileDAO = new MobileDAOImpl();
		mobileDAO.saveMobileRecord();
        mobileDAO.updateBrand();
        mobileDAO.updateBrandAndPrice();
        mobileDAO.readSingleRecordById();
        mobileDAO.readAllRecord();
        mobileDAO.readMobilePriceById();
        mobileDAO.readMobileBrandById();
        mobileDAO.readMobileColorById();
        mobileDAO.deleteMobileById();
	}
}
