package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForceAccountsPage {
	
	private WebDriver driver;
	
	private By newBtn = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div");
	
	public SalesForceAccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getnewBtn() {
		return driver.findElement(newBtn);
	}

}
