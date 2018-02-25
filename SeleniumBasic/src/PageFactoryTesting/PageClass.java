package PageFactoryTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageClass 
{
	@FindBy(id="hotelCodeId")
	public WebElement hotelid;
	
	@FindBy(name="userName")
	public WebElement userName;
	
	@FindBy(id="passwordId")
	public WebElement password;
	
	@FindBy(xpath="//table[@id='formtable']//tr[10]//input")
	public WebElement login;
		
	public void adminLogin()
	{
		hotelid.sendKeys("707");
		userName.sendKeys("din@gmail.com");
		password.sendKeys("111111");
		login.click();
	}
}
