package com.PageFactroyTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage 
{
	@FindBy(id="flip")
	public WebElement viewReport;
	
	@FindBy(xpath="//a[text()='Amenities']")
	public WebElement amenities;
	
	public AmenitiesListPage clickAmenities()
	{
		BasePage.jsClick(amenities);
		
		AmenitiesListPage ALP = PageFactory.initElements(BasePage.driver, AmenitiesListPage.class);
		return ALP;
	}

	
	
}
