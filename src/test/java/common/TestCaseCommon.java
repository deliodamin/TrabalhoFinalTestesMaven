package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseCommon {
//	private static WebDriver driver;
	public static  WebDriver driver;
	public static final String URL_BASE = "http://scrm.elipse.com.br";
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		return driver;
	}
	

}
