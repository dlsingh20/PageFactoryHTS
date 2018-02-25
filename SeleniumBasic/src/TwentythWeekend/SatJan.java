package TwentythWeekend;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SatJan {
	
	public static void main(String[] args) throws IOException {
		GMethods.launchURLAndBrowser("https://www.facebook.com/");
		
		WebElement fName = GMethods.driver.findElement(By.id("u_0_l"));
		String name = GMethods.readExcel(2, 1);
		fName.sendKeys(name);
		
		
				
		
		
	}

}
