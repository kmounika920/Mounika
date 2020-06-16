package Packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\geckodriver.exe");
		// TODO Auto-generated method stub
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("http://www.gmail.com");
		 driver.manage().window().maximize();
		 
		 Actions a =new Actions (driver);
		 
		 
		
			 WebElement Email = driver.findElement(By.xpath("//*[@id='identifierId']"));
			 
			 a.moveToElement(Email).build().perform();
			 a.contextClick(Email).build().perform();
			  
			  
			  driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("mouni");
			 
				
		WebElement CreateAccount = driver.findElement(By.xpath("//*[@class='NlWrkb snByac']"));
				 
				 a.moveToElement(CreateAccount).build().perform();
				 
				  driver.findElement(By.xpath("//*[@class='NlWrkb snByac")).click();
				 
	
		 
		 a.sendKeys(Keys.F5);
		 
	}

}
