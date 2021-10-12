package com.xworkz.mobilewithstatickey;

import com.xworkz.mobilewithstatickey.dao.MobileDAO;
import com.xworkz.mobilewithstatickey.dao.MobileDAOImpl;

public class MobileTester {
	public static void main(String[] args) {
		MobileDAO mobileDAO = new MobileDAOImpl();
		mobileDAO.savaMobileRecord();
		System.out.println("----------------------------------");
		mobileDAO.radAllRecord();
		System.out.println("----------------------------------");
		mobileDAO.updateBrand();
		System.out.println("----------------------------------");
		mobileDAO.updateBrandAndPrice();
		System.out.println("----------------------------------");
		mobileDAO.readMobileBrandById();
		System.out.println("----------------------------------");
		mobileDAO.readMobileColorById();
		System.out.println("----------------------------------");
		mobileDAO.readMobilePriceById();
		System.out.println("----------------------------------");
		mobileDAO.deleteMobileRecordById();
}
}
