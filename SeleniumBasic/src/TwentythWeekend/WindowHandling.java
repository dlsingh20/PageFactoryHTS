package TwentythWeekend;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	static String fStChuldWinID;
	static String sStChuldWinID;
	public static void main(String[] args) throws InterruptedException {
		nykaa();

	}
	public static void nykaa() throws InterruptedException
	{
		GMethods.launchURLAndBrowser("http://www.nykaa.com/kajal?intcmp=hp,quick_links,2,kajal-finder");
		String pWinID = GMethods.driver.getWindowHandle();
		//System.out.println(pWinID);
		
		WebElement skin = GMethods.driver.findElement(By.xpath("//div[@id='my-menu']/ul/li[2]/a"));
		GMethods.mouseOver(skin);
		Thread.sleep(4000);
		WebElement faceWash = GMethods.driver.findElement(By.xpath("//div[@id='my-menu']/ul/li[2]//div/ul//a"));
		faceWash.click();
		
		Set<String> allWinID = GMethods.driver.getWindowHandles();
		
		//int size = allWinID.size();
		
		
		
		for(String str:allWinID)
		{
			if(!str.equalsIgnoreCase(pWinID))
			{
				fStChuldWinID= str;
				GMethods.driver.switchTo().window(str);
			}
		}
		
		WebElement hair = GMethods.driver.findElement(By.xpath("//div[@id='my-menu']/ul/li[3]/a"));
		GMethods.mouseOver(hair);
		
		WebElement shampoo = GMethods.driver.findElement(By.xpath("//div[@id='my-menu']/ul/li[3]//div/ul//a"));
		shampoo.click();
		
		
		allWinID = GMethods.driver.getWindowHandles();
		
		for(String str:allWinID)
		{
			if(!str.equalsIgnoreCase(pWinID) && !str.equalsIgnoreCase(fStChuldWinID))
			{
				sStChuldWinID= str;
				GMethods.driver.switchTo().window(str);
			}
		}
		
		GMethods.driver.switchTo().window(pWinID).close();;
		GMethods.driver.switchTo().window(fStChuldWinID).close();;
		GMethods.driver.switchTo().window(sStChuldWinID);
		
		//WebElement appliances = GMethods.driver.findElement(By.xpath("//div[@id='my-menu']/ul/li[4]/a"));
		//GMethods.mouseOver(appliances);
		
		////
		//WebElement dove = GMethods.driver.findElement(By.xpath("li[@id='product-opt-183990']/div[2]/div[4]/a/img"));
		//img[@src='http://adn-static1.nykaa.com/media/catalog/product/cache/4/small_image/200x/9df78eab33525d08d6e5fb8d27136e95/2/6/26069_s1.jpg']
		
		WebElement dove = GMethods.driver.findElement(By.xpath("img[@src='http://adn-static1.nykaa.com/media/catalog/product/cache/4/small_image/200x/9df78eab33525d08d6e5fb8d27136e95/2/6/26069_s1.jpg']"));
		dove.click();
	}
}
