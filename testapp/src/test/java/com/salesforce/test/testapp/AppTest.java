package com.salesforce.test.testapp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.SalesForceAccountsPage;
import pageobjects.SalesForceCreateOrEditAccountModal;
import pageobjects.SalesForceCreatedAccountPage;
import pageobjects.SalesForceHomePage;
import pageobjects.SalesForceLoginPage;

public class AppTest {

	WebDriver driver;
	BaseClass baseObject;
	WebDriverWait wait;
	SalesForceHomePage homePage;
	SalesForceLoginPage loginPage;
	SalesForceAccountsPage accountsPage;
	SalesForceCreateOrEditAccountModal createOrEditAccModal;
	SalesForceCreatedAccountPage createdAccountPage;

	@BeforeSuite
	public void setUp() throws IOException {
		baseObject = new BaseClass();
		driver = baseObject.getDriver(); // driver setup
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		homePage = new SalesForceHomePage(driver);
		loginPage = new SalesForceLoginPage(driver);
		accountsPage = new SalesForceAccountsPage(driver);
		createOrEditAccModal = new SalesForceCreateOrEditAccountModal(driver);
		createdAccountPage = new SalesForceCreatedAccountPage(driver);

	}

	@AfterSuite
	public void driverCleanUp() {
		driver.close();
		driver.quit();
	}

	@Parameters({ "username", "password" })
	@BeforeTest
	public void signIn(String username, String password) {
		driver.get(baseObject.getUrl());
		loginPage.getUsernameInput().sendKeys(username);
		loginPage.getPassWordInput().sendKeys(password);
		loginPage.getLoginBtn().click();
	}

	@AfterTest
	public void DeleteAccountAndsignOut() {
		createdAccountPage.getDropDownDeleteAccount().click();
		createdAccountPage.getDeleteAccountBtn().click();
		createdAccountPage.getConfirmDeletionOfAccountBtn().click();
		homePage.getProfileBtn().click();
		homePage.getLogOutBtn().click();
	}

	@Test
	public void createAccountTest() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", homePage.getAccountsBtn());

		accountsPage.getnewBtn().click();

		createOrEditAccModal.getAccountNameInput().sendKeys("TestName");
		createOrEditAccModal.getWebSiteInput().sendKeys("www.testWebsite.com");
		createOrEditAccModal.getTypeDropDownList().click();
		createOrEditAccModal.getAnalystDdlOpition().click();
		createOrEditAccModal.getAccountDescriptionInput().sendKeys("test description");
		createOrEditAccModal.getPhoneInput().sendKeys("322 322 3232");
		createOrEditAccModal.getBillingAddressinput().sendKeys("Cra 26 #10 112");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Wait for list options to be
																						// populated
		createOrEditAccModal.getBillingAddressinput().sendKeys(Keys.ARROW_DOWN);
		createOrEditAccModal.getBillingAddressinput().sendKeys(Keys.ENTER);
		createOrEditAccModal.getBillingStateInput().sendKeys("ANT");
		createOrEditAccModal.getShippingAddressInput().sendKeys("Cra 26 #10 112");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Wait for list options to be
																						// populated
		createOrEditAccModal.getShippingAddressInput().sendKeys(Keys.ARROW_DOWN);
		createOrEditAccModal.getShippingAddressInput().sendKeys(Keys.ENTER);
		createOrEditAccModal.getShippingStateInput().sendKeys("ANT");

		createOrEditAccModal.getSaveBtn().click();

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(createdAccountPage.getAccountNameSelector()));
			if (createdAccountPage.getAccountName().getText().equals("TestName")) {
				System.out.println("Account was created succesfully");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Gives some time for
																								// the screenshot to be
																								// taken
				baseObject.takeSnapShot(driver);
				Assert.assertNotNull(createdAccountPage.getAccountName(), "Account was created");
			} else {
				System.out.println("Account creation failed or was named incorrectly");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Gives some time for
				// the screenshot to be
				// taken
				baseObject.takeSnapShot(driver);
				Assert.fail("Account creation failed or was named incorrectly");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Account creation failed, " + e.getMessage());
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Gives some time for
			// the screenshot to be
			// taken
			baseObject.takeSnapShot(driver);
			Assert.fail("Account creation failed");
		}
	}

	@Test(dependsOnMethods = { "createAccountTest" })
	public void editAccountTest() {
		createdAccountPage.getEditAccountBtn().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(createOrEditAccModal.getAccountNameInputEditSelector()));

		createOrEditAccModal.getAccountNameInputEdit().sendKeys(" modified");
		createOrEditAccModal.getWebSiteInputEdit().sendKeys(".co");
		createOrEditAccModal.getAccountDescriptionInputEdit().sendKeys(" modified");
		createOrEditAccModal.getPhoneInputEdit().sendKeys(" 00");
		createOrEditAccModal.getBillingAddressinputEdit().sendKeys("Cra 25 #10 40");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Wait for list options to be
																						// populated
		createOrEditAccModal.getBillingAddressinputEdit().sendKeys(Keys.ARROW_DOWN);
		createOrEditAccModal.getBillingAddressinputEdit().sendKeys(Keys.ENTER);
		createOrEditAccModal.getBillingStateInputEdit().sendKeys("ANT");
		createOrEditAccModal.getShippingAddressInputEdit().sendKeys("Cra 25 #10 40");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Wait for list options to be
																						// populated
		createOrEditAccModal.getShippingAddressInputEdit().sendKeys(Keys.ARROW_DOWN);
		createOrEditAccModal.getShippingAddressInputEdit().sendKeys(Keys.ENTER);
		createOrEditAccModal.getShippingStateInputEdit().sendKeys("ANT");

		createOrEditAccModal.getSaveBtn().click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Wait for changes to be
		// saved
		String modifiedAccountName = createdAccountPage.getAccountName().getText();
		String modifiedWebSite = createdAccountPage.getAboutWebsite().getText();
		String modifiedDescription = createdAccountPage.getAboutDescription().getText();
		String modifiedPhone = createdAccountPage.getAboutPhone().getText();
		String modifiedBillingAddress = createdAccountPage.getAboutBillingAddress().getText();
		String modifiedShippingAddress = createdAccountPage.getAboutShippingAddress().getText();

		System.out.println("\nnew account name: " + modifiedAccountName);
		System.out.println("new website: " + modifiedWebSite);
		System.out.println("new description: " + modifiedDescription);
		System.out.println("new phone: " + modifiedPhone);
		System.out.println("new billing address: " + modifiedBillingAddress);
		System.out.println("new shipping address: " + modifiedShippingAddress);

		if (modifiedAccountName.equals("TestName modified") && modifiedWebSite.equals("www.testWebsite.com.co")
				&& modifiedDescription.equals("test description modified") && modifiedPhone.equals("322 322 3232 00")
				&& modifiedBillingAddress.equals("10-40 Carrera 25")
				&& modifiedShippingAddress.equals("10-40 Carrera 25")) {
			System.out.println("\nAccount was modified succesfully");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Gives some time for
			// the screenshot to be
			// taken
			baseObject.takeSnapShot(driver);
			Assert.assertTrue(true);
		} else {
			System.out.println("\nAccount modification failed");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("notAnId"))); // Gives some time for
			// the screenshot to be
			// taken
			baseObject.takeSnapShot(driver);
			Assert.fail("\nAccount modification failed");
		}

	}

}
