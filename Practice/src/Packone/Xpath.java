package Packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\geckodriver.exe");
		 
		  WebDriver driver=new FirefoxDriver();
		 
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Mounika");
		 driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Password");
		 driver.findElement(By.xpath("//*[@id='month']/descendant::*[@value='11']")).click();
		 
		 List<WebElement> years= driver.findElements(By.xpath("//*[@id='year']/preceding::*"));
			System.out.println(years.size());
			
			 List<WebElement> year1= driver.findElements(By.xpath("//*[@id='year']/preceding::a"));
				System.out.println(year1.size());
				
				List<WebElement> count1= driver.findElements(By.xpath("//*[@id='year']/preceding::a[3]"));
				System.out.println(count1.size());		
				
		 List<WebElement> links= driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		driver.close();
	}

}