package Packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\APSRTC\\Mouni\\Work\\geckodriver.exe");		
WebDriver driver=new FirefoxDriver();

driver.get("http://money.reddiff.com/sectors/bse/infra");


		
	}

}
