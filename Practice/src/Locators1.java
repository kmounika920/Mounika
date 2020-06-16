import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.facebook.com");
		 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
driver.findElement(By.id("email")).sendKeys("Mounikokaluri@gmail.com");
driver.findElement(By.name("pass")).sendKeys("Mounika");
driver.findElement(By.name("sex")).click();
driver.findElement(By.linkText("Forgotten account?")).click();
driver.close();

	}

}
