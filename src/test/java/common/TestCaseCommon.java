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
	
	/*public static String getTimestamp() {
		
		Calendar dt = new GregorianCalendar();
		
		///String d = normalizeNumber(dt.get(Calendar.DAY_OF_MONTH),2);
		String m = normalizeNumber(dt.get(Calendar.MONTH),2);
		String y = dt.get(Calendar.YEAR)+"";
		String h = normalizeNumber(dt.get(Calendar.HOUR_OF_DAY),2);
		String mi = normalizeNumber(dt.get(Calendar.MINUTE),2);
		String s = normalizeNumber(dt.get(Calendar.SECOND),2);
		
		return y+m+d+h+mi+s;
	}
	
	private static String normalizeNumber(int value, int length) {
		String normal = value + "";
		String zeros = "";
		for (int i = 0; i < (length - normal.length()); i++) {
			zeros += "0";
		}
		
		return zeros+normal;
	}*/
}
