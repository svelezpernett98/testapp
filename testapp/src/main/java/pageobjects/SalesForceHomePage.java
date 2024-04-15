package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForceHomePage {

	private WebDriver driver;

	private By accountsBtn = By.xpath(
			"/html/body/div[4]/div[1]/section/div[2]/runtime_sales_easy-vertical-nav/div/ul/li[3]/runtime_sales_easy-vertical-nav-app-item/a/span[1]/img");
	private By profileBtn = By.xpath(
			"/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[5]/span/button/div/span[1]/div/span");
	private By logOutBtn = By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/a[2]");

	public SalesForceHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAccountsBtn() {
		return driver.findElement(accountsBtn);
	}

	public WebElement getProfileBtn() {
		return driver.findElement(profileBtn);
	}

	public WebElement getLogOutBtn() {
		return driver.findElement(logOutBtn);
	}

}
