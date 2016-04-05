package SeleniumIDE;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class verificaExistenciaDeGrafico {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://scrm.elipse.com.br/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVerificaExistenciaDeGrafico() throws Exception {
   
    driver.get(baseUrl + "/login.jsp");
    driver.findElement(By.name("usr")).clear();
    driver.findElement(By.name("usr")).sendKeys("delio");
    driver.findElement(By.name("pw")).clear();
    driver.findElement(By.name("pw")).sendKeys("ADM66@*29");
    driver.findElement(By.cssSelector("button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//a[@id='suporteA']/div)[5]")).click();
    Thread.sleep(1000);
    for (int second = 0;; second++) {
    	if (second >= 5) fail("timeout");
    	System.out.println(isElementPresent(By.xpath("//div[@id='placeholder']/canvas[2]")));
//    	System.out.println(isElementPresent(By.cssSelector("canvas.flot-overlay")));
    	try { if (isElementPresent(By.cssSelector("canvas.flot-overlay"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
