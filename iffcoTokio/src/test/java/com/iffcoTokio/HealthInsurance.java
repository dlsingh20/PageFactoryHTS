package com.iffcoTokio;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Utilities.GMethods;

public class HealthInsurance 
{
	 
	@Test(priority=1, groups = {"Smoke", "Regression"})
	public void testCase1() throws Exception
	{
		try {
			GMethods.driver = new FirefoxDriver();
			GMethods.driver.get("http://www.facebook.com");
			
		//	GMethods.driver.findElement(By.xpath("//hghhh"));
		} catch (Exception e) {
			GMethods.takeScreenshot("testCase1");
			throw e;
		}
		
	}
	
	//@Test(priority=2, groups = {"Smoke", "Integration"})
	public void testCase2() throws Exception
	{
		try {
			GMethods.driver = new FirefoxDriver();
			GMethods.driver.get("http://www.google.com");
			GMethods.driver.findElement(By.xpath("//hghhh"));
		} catch (Exception e) {
			GMethods.takeScreenshot("testCase2");
			throw e;
		}
		
	}
	
	//@Test(priority=3, groups= {"Integration"})
	public void testCase3()
	{
		GMethods.driver = new FirefoxDriver();
		GMethods.driver.get("http://www.linkedin.com");
	}
	
	//@Test
	public void writeExcel()
	{
		GMethods.writeInExcelFile();
		
	}

}