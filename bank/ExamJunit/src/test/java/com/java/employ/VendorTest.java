package com.java.employ;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.Test;




public class VendorTest {
	
	
	@Test
	public void testGettersAndSetters() throws ParseException{

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
		Date vendorStartedDate=sdf.parse("2023-01-14");
		Date vendorStartedDateactual=sdf.parse("2023-01-14");
		Vendor vendor = new Vendor();
		vendor.setVendorId(1);
		vendor.setVendorName("Smruti");
		vendor.setVendorCity("BBSR");
		vendor.setVendorEmail("smruti123@gmail.com");
		vendor.setVendorMobile("7826465671");
		vendor.setVendorStatus("Approved");
		vendor.setVendorStartedDate(vendorStartedDate);
		vendor.setVendorRating(9.5);
		vendor.setVendorReview("Good");
		assertEquals(1, vendor.getVendorId());
		assertEquals("Smruti", vendor.getVendorName());
		assertEquals("BBSR", vendor.getVendorCity());
		assertEquals("smruti123@gmail.com", vendor.getVendorEmail());
		assertEquals("7826465671", vendor.getVendorMobile());
		assertEquals("Approved", vendor.getVendorStatus());
		assertEquals(vendorStartedDate, vendorStartedDateactual);
		assertEquals(9.5, vendor.getVendorRating(),0);
		assertEquals("Good", vendor.getVendorReview());
	}

	
	@Test
	public void testHashCode() {
		Date date = new Date();
		Vendor vender = new Vendor(1, "Smruti", "BBSR", "smruti123.com", "234567", "Active", date, 9.5,
				"Good");
		Vendor ven = new Vendor(1, "Smruti", "BBSR", "smruti123.com", "234567", "Active", date, 9.5,
				"Good");
		Assert.assertTrue(vender.equals(ven) && ven.equals(ven));
		Assert.assertTrue(vender.hashCode() == ven.hashCode());
	}
	
	
	@Test
	public void testConstructors() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date vendorStartedDate = sdf.parse("2023-09-22");
		Date actual = sdf.parse("2023-09-22");
		
		Vendor vendor = new Vendor();
		assertNotNull(vendor);
		Vendor ven = new Vendor(1,"Smruti","BBSR","Smruti123@gmail.com","78765","Active",vendorStartedDate,9.5,"Good");
		assertEquals(1,ven.getVendorId());
		assertEquals("Smruti", ven.getVendorName());
		assertEquals("BBSR", ven.getVendorCity());
		assertEquals("Smruti123@gmail.com", ven.getVendorEmail());
		assertEquals("78765", ven.getVendorMobile());
		assertEquals("Active",ven.getVendorStatus());
		assertEquals(vendorStartedDate, actual);
		assertEquals(9.5,ven.getVendorRating(),0);
		assertEquals("Good",ven.getVendorReview());
		 
	}
	

	@Test
	public void testToString()  throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
		Date vendorStartedDate=sdf.parse("2023-01-14");
		
		Vendor vendor = new Vendor(1,"Smruti","BBSR","smruti123@gmail.com","7826465671","Approved", vendorStartedDate,9.5,"Good");
		String result= "Vendor [vendorId=1, vendorName=Smruti, vendorCity=BBSR, vendorEmail=smruti123@gmail.com, vendorMobile=7826465671, vendorStatus=Approved, vendorStartedDate=Sat Jan 14 00:00:00 IST 2023, vendorRating=9.5, vendorReview=Good]";
		assertEquals(result, vendor.toString());
	
	}
	

}
