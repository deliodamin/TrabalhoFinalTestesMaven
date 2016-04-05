package SeleniumIDE;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
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

public class buscaTreinamentoPorNome {
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
  public void testBuscaTreinamentoPorNome() throws Exception {
	  driver.get(baseUrl + "/login.jsp"); 
		driver.findElement(By.name("usr")).clear();
		driver.findElement(By.name("usr")).sendKeys("delio");
		driver.findElement(By.name("pw")).clear();
		driver.findElement(By.name("pw")).sendKeys("ADM66@*29");
		driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.xpath("(//a[@id='suporteA']/div)[3]")).click();
    driver.findElement(By.id("nome")).clear();
    driver.findElement(By.id("nome")).sendKeys("Roberto");
    driver.findElement(By.cssSelector("input.botao.submit")).click();
    assertThat("0", is(not(driver.findElement(By.xpath("//span[@id='EmpEncontradas']/b")).getText())));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
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
