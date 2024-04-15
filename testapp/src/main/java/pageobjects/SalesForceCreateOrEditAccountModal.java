package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForceCreateOrEditAccountModal {

	private WebDriver driver;

	//For create account modal:
	private By modalAccountNameInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/span/slot/records-record-layout-base-input/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	private By modalWebSiteInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/lightning-input/lightning-primitive-input-simple/div/div/input");
	private By modalTypeDropDownList = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/div/lightning-base-combobox/div/div/div[1]/button"); 
																																																																																																																																																																																																																																																																																																																									// EDIT
	private By modalAnalystDdlOpition = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/div/lightning-base-combobox/div/div/div[2]/lightning-base-combobox-item[2]/span[2]/span");
	private By modalAccountDescriptionInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item/div/span/slot/records-record-layout-text-area/lightning-textarea/div/textarea");
	private By modalPhoneInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/span/slot/lightning-input/lightning-primitive-input-simple/div/div/input");
	private By modalBillingAddressinput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[1]/lightning-lookup-address/div/lightning-base-combobox/div/div/div[1]/div[1]/div/input");
	private By modalBillingStateInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[3]/lightning-input[2]/lightning-primitive-input-simple/div/div/input");
	private By modalShippingAddressInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[1]/lightning-lookup-address/div/lightning-base-combobox/div/div/div[1]/div[1]/div/input");
	private By modalShippingStateInput = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[3]/lightning-input[2]/lightning-primitive-input-simple/div/div/input");
	private By modalSaveBtn = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/records-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button");

	//For edit account modal:
	private By modalAccountNameInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/span/slot/records-record-layout-base-input/lightning-input/lightning-primitive-input-simple/div/div/input");
	private By modalWebSiteInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/lightning-input/lightning-primitive-input-simple/div/div/input");
	private By modalAccountDescriptionInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item/div/span/slot/records-record-layout-text-area/lightning-textarea/div/textarea");
	private By modalPhoneInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/span/slot/lightning-input/lightning-primitive-input-simple/div/div/input");
	private By modalBillingAddressinputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[1]/lightning-lookup-address/div/lightning-base-combobox/div/div/div[1]/div[1]/div/input");
	private By modalBillingStateInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[3]/lightning-input[2]/lightning-primitive-input-simple/div/div/input");
	private By modalShippingAddressInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[1]/lightning-lookup-address/div/lightning-base-combobox/div/div/div[1]/div[1]/div/input");
	private By modalShippingStateInputEdit = By.xpath(
			"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div[2]/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-layout-input-address/lightning-input-address/fieldset/div/div/div[3]/lightning-input[2]/lightning-primitive-input-simple/div/div/input");

	public SalesForceCreateOrEditAccountModal(WebDriver driver) {
		this.driver = driver;
	}

	//For create account modal:
	public WebElement getAccountNameInput() {
		return driver.findElement(modalAccountNameInput);
	}

	public WebElement getWebSiteInput() {
		return driver.findElement(modalWebSiteInput);
	}

	public WebElement getTypeDropDownList() {
		return driver.findElement(modalTypeDropDownList);
	}

	public WebElement getAnalystDdlOpition() {
		return driver.findElement(modalAnalystDdlOpition);
	}

	public WebElement getAccountDescriptionInput() {
		return driver.findElement(modalAccountDescriptionInput);
	}

	public WebElement getPhoneInput() {
		return driver.findElement(modalPhoneInput);
	}

	public WebElement getBillingAddressinput() {
		return driver.findElement(modalBillingAddressinput);
	}

	public WebElement getBillingStateInput() {
		return driver.findElement(modalBillingStateInput);
	}

	public WebElement getShippingAddressInput() {
		return driver.findElement(modalShippingAddressInput);
	}

	public WebElement getShippingStateInput() {
		return driver.findElement(modalShippingStateInput);
	}

	public WebElement getSaveBtn() {
		return driver.findElement(modalSaveBtn);
	}

	//For edit account modal:
	public WebElement getAccountNameInputEdit() {
		return driver.findElement(modalAccountNameInputEdit);
	}

	public By getAccountNameInputEditSelector() {
		return modalAccountNameInputEdit;
	}

	public WebElement getWebSiteInputEdit() {
		return driver.findElement(modalWebSiteInputEdit);
	}

	public WebElement getAccountDescriptionInputEdit() {
		return driver.findElement(modalAccountDescriptionInputEdit);
	}

	public WebElement getPhoneInputEdit() {
		return driver.findElement(modalPhoneInputEdit);
	}

	public WebElement getBillingAddressinputEdit() {
		return driver.findElement(modalBillingAddressinputEdit);
	}

	public WebElement getBillingStateInputEdit() {
		return driver.findElement(modalBillingStateInputEdit);
	}

	public WebElement getShippingAddressInputEdit() {
		return driver.findElement(modalShippingAddressInputEdit);
	}

	public WebElement getShippingStateInputEdit() {
		return driver.findElement(modalShippingStateInputEdit);
	}

}
