import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\chromedriver.exe");
 
 WebDriver driver=new ChromeDriver();
 
 driver.get("http://www.facebook.com");
 
 
 
 System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());


	}

}
