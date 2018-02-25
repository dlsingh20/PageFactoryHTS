package com.PageFactroyTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmenitiesListPage 
{
	@FindBy(xpath="//a[text()='| Logout']")
	public WebElement logout;
	
	public LogoutAdmin logoutAdmin()
	{
		logout.click();
		
		LogoutAdmin LA = PageFactory.initElements(BasePage.driver, LogoutAdmin.class);
		return LA;
	}

}
