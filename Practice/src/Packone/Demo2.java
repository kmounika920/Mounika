package Packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://cvw.corp.cigna.com/logon/LogonPoint/tmindex.html");
		 driver.findElement(By.id("login")).sendKeys("M84581");
		 
	}

}
