package com.PageFactroyTest;

import org.testng.annotations.Test;

public class TestClass 
{
	@Test
	public void login() throws InterruptedException
	{
		LoginPage LP = BasePage.openAdmin();
		AdminHomePage AHP = LP.login();
		AmenitiesListPage ALP = AHP.clickAmenities();
		Thread.sleep(2500);
		ALP.logoutAdmin();
	}

}
