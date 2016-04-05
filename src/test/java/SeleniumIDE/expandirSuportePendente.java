package SeleniumIDE;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class expandirSuportePendente {
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
  public void testExpandirSuportePendente() throws Exception {
    driver.get(baseUrl + "/login.jsp");
    driver.findElement(By.name("usr")).clear();
    driver.findElement(By.name("usr")).sendKeys("delio");
    driver.findElement(By.name("pw")).clear();
    driver.findElement(By.name("pw")).sendKeys("ADM66@*29");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.xpath("//div[@id='view80079']/div[2]/div[2]/span")).click();
    Thread.sleep(1000);  
    assertEquals("Produto", driver.findElement(By.xpath("//form[@id='formMostraSuporte']/fieldset/fieldset/div/label")).getText());
    driver.findElement(By.xpath("//div[@id='view80079']/div[2]/div[2]/span")).click();
 
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
