package com.PageFactroyTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="hotelCodeId")
	public WebElement hotelID;
	
	@FindBy(id="userNameId")
	public WebElement email;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="Submit52")
	public WebElement login;
	
	public AdminHomePage login()
	{
		hotelID.sendKeys("707");
		email.sendKeys("din.dayal@hotelogix.com");
		password.sendKeys("111111");
		login.click();
		
		AdminHomePage AHP = PageFactory.initElements(BasePage.driver, AdminHomePage.class);
		return AHP;
	}
}
