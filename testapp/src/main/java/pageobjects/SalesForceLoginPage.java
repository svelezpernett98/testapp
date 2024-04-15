package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForceLoginPage {

	private WebDriver driver;

	private By usernameInput = By.cssSelector("input#username");
	private By passWordInput = By.cssSelector("input#password");
	private By loginBtn = By.cssSelector("input#Login");

	public SalesForceLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameInput() {
		return driver.findElement(usernameInput);
	}

	public WebElement getPassWordInput() {
		return driver.findElement(passWordInput);
	}

	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}

}
