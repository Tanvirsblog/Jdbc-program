package com.xworkz.mobile.dao;

import java.sql.SQLException;

public interface MobileDAO {
	
	void saveMobileRecord();
	
	void updateBrand();
	
	void updateBrandAndPrice();
	
	void deleteMobileById();
	
	void readSingleRecordById();
	
	void readAllRecord();
	
	void readMobilePriceById();
	
	void readMobileBrandById();
	
	void readMobileColorById();

}
