package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForceCreatedAccountPage {
	
private WebDriver driver;
	
	private By accountName = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/flexipage-pinned-header/slot/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div/div[1]/div[2]/h1/slot/sfa-output-name-with-hierarchy-icon-account/sfa-output-name-with-hierarchy-icon-wrapper/force-aura-action-wrapper/div/div/lightning-formatted-text");
	private By dropDownDeleteAccount = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/flexipage-pinned-header/slot/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[4]/lightning-button-menu/button/lightning-primitive-icon");
	private By deleteAccountBtn = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/flexipage-pinned-header/slot/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[4]/lightning-button-menu/div/div/slot/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-aura-legacy/slot/slot/lightning-menu-item/div/a");
	private By confirmDeletionOfAccountBtn = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]");
	private By editAccountBtn = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/flexipage-pinned-header/slot/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-page-reference/slot/slot/lightning-button/button");
	private By aboutWebsite = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/one-template-workspace/slot/div/flexipage-record-home-scrollable-column[1]/slot/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/div/dl/dd/div/span/slot[1]/lightning-formatted-url/a");
	private By aboutType = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/one-template-workspace/slot/div/flexipage-record-home-scrollable-column[1]/slot/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/div/dl/dd/div/span/slot[1]/lightning-formatted-text");
	private By aboutDescription = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/one-template-workspace/slot/div/flexipage-record-home-scrollable-column[1]/slot/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item/div/div/dl/dd/div/span/slot[1]/lightning-formatted-text");
	private By aboutPhone = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/one-template-workspace/slot/div/flexipage-record-home-scrollable-column[1]/slot/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/div/dl/dd/div/span/slot[1]/records-output-phone/lightning-formatted-phone/a");
	private By aboutBillingAddress = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/one-template-workspace/slot/div/flexipage-record-home-scrollable-column[1]/slot/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/div/dl/dd/div/span/slot[1]/lightning-formatted-address/a/div[1]");
	private By aboutShippingAddress = By.xpath("/html/body/div[4]/div[1]/section/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_account_record_page_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-pinned-header-template-desktop2/div/one-template-workspace/slot/div/flexipage-record-home-scrollable-column[1]/slot/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/div/dl/dd/div/span/slot[1]/lightning-formatted-address/a/div[1]");

	
	public SalesForceCreatedAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAccountName() {
		return driver.findElement(accountName);
	}
	
//	public WebElement getAccountLink() {
//		return driver.findElement(accountLink);
//	}
	
//	public By getAccountLinkSelector() {
//		return accountLink;
//	}
	
	public By getAccountNameSelector() {
		return accountName;
	}
	
	public WebElement getDropDownDeleteAccount() {
		return driver.findElement(dropDownDeleteAccount);
	}
	
	public WebElement getDeleteAccountBtn() {
		return driver.findElement(deleteAccountBtn);
	}
	
	public WebElement getConfirmDeletionOfAccountBtn() {
		return driver.findElement(confirmDeletionOfAccountBtn);
	}
	
	public WebElement getEditAccountBtn() {
		return driver.findElement(editAccountBtn);
	}
	
	////////////////
	
	public WebElement getAboutWebsite() {
		return driver.findElement(aboutWebsite);
	}
	
	public WebElement getAboutType() {
		return driver.findElement(aboutType);
	}
	
	public WebElement getAboutDescription() {
		return driver.findElement(aboutDescription);
	}
	
	public WebElement getAboutPhone() {
		return driver.findElement(aboutPhone);
	}
	
	public WebElement getAboutBillingAddress() {
		return driver.findElement(aboutBillingAddress);
	}
	
	public WebElement getAboutShippingAddress() {
		return driver.findElement(aboutShippingAddress);
	}

}
