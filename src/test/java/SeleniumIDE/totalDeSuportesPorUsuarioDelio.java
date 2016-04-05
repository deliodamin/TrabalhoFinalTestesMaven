package SeleniumIDE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class totalDeSuportesPorUsuarioDelio {
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
  public void testTotalDeSuportesPorUsuarioDelio() throws Exception {
    driver.get(baseUrl + "/index.jsp");
   	driver.findElement(By.name("usr")).clear();
	driver.findElement(By.name("usr")).sendKeys("delio");
	driver.findElement(By.name("pw")).clear();
	driver.findElement(By.name("pw")).sendKeys("ADM66@*29");
	driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.cssSelector("#buscaA > div")).click();
    new Select(driver.findElement(By.id("usuario"))).selectByVisibleText("Délio Livir da Silva Damin");
    driver.findElement(By.cssSelector("input.botao.submit")).click();
     assertEquals("3532", driver.findElement(By.xpath("//span[@id='EmpEncontradas']/b")).getText());
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
