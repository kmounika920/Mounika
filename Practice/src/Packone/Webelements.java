package Packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("http://www.facebook.com");
	 driver.manage().window().maximize();
	 
	WebElement email=  driver.findElement(By.id("Email"));
	
 email.sendKeys("Mounika");
email.clear();
email.sendKeys("Venki");

	}

}