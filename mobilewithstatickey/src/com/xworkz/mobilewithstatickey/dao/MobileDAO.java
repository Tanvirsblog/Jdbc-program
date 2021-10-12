package com.xworkz.mobilewithstatickey.dao;

public interface MobileDAO {
	
	void savaMobileRecord();
	
	void updateBrand();
	
	void updateBrandAndPrice();
	
	void readSingleRecordById();
	
	void radAllRecord();
	
	void readMobilePriceById();
	
	void readMobileBrandById();
	
	void readMobileColorById();
	
	void deleteMobileRecordById();

}
