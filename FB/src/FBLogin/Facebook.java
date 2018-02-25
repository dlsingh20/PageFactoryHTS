package FBLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("aaaa");
		driver.findElement(By.id("pass")).sendKeys("ssss");
		
		driver.findElement(By.id("u_0_a")).click();
		
	}

}
