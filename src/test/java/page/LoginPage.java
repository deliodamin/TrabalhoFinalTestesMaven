package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class LoginPage extends HomePage {

	private WebElement inputUsername;
	private WebElement inputPassword;
	private WebElement buttonLogin;
	

	public LoginPage() {

		inputUsername = TestCaseCommon.getDriver().findElement(By.name("usr"));
		inputPassword = TestCaseCommon.getDriver().findElement(By.name("pw"));
		buttonLogin = TestCaseCommon.getDriver().findElement(By.cssSelector("button"));
	//	screenName = TestCaseCommon.getDriver().findElement(By.id("HereIAm"));
	}

//	public WebElement getScreenName() {
	//	return screenName;
//	}
	
	public WebElement getInputUsername() {
		return inputUsername;
	}

	public void setInputUsername(WebElement inputUsername) {
		this.inputUsername = inputUsername;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	public void setButtonLogin(WebElement buttonLogin) {
		this.buttonLogin = buttonLogin;
	}

	public void Login(String username, String password) {
		inputUsername.clear(); // WebElement
		inputUsername.sendKeys(username);
		inputPassword.clear();
		inputPassword.sendKeys(password);
		buttonLogin.click();
	}

}
