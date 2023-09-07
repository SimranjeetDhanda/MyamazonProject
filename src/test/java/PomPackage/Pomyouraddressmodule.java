package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import BasePackage.Baseclass;

public class Pomyouraddressmodule extends Baseclass{
//object repository
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
	WebElement YourAddressTab;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[1]/div/h1")
	WebElement YourAddressesTittle;
	@FindBy(css="#ya-myab-address-add-link > div > div")
	WebElement AddAddressOption;
	@FindBy(css="#address-ui-widgets-countryCode > span > span")
	WebElement DropDown;
	@FindBy(linkText="Canada")
	WebElement option;
	@FindBy(css="#address-ui-widgets-enterAddressFullName")
	WebElement FullName;
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber")
	WebElement PhoneNumber;
	@FindBy(css="#address-ui-widgets-enterAddressLine1")
	WebElement AddressLine1;
	@FindBy(css="#address-ui-widgets-enterAddressCity")
	WebElement City;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span")
WebElement ProvinceDropDown;
	@FindBy(css="#address-ui-widgets-enterAddressPostalCode")
	WebElement PostalCode;
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input")
	WebElement AddAddressBtn;
	public Pomyouraddressmodule() {
		PageFactory.initElements(driver, this);}
	@FindBy(css="#address-ui-widgets-enterAddressFullName-full-validation-alerts > div > div > div > div")
WebElement ErrorFullname;
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber-full-validation-alerts > div > div > div > div")
	WebElement ErrorMsgEmptyPhone;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")
    WebElement Ontario;
	@FindBy(css="#address-ui-widgets-enterAddressLine2-full-validation-alerts > div > div > div > div")
     WebElement ErrorMsgAddressEmpty;
	@FindBy(css="#yaab-alert-box > div")
	WebElement AddressSaveSuccessMsg;
	@FindBy(css="#address-ui-widgets-enterAddressPostalCode-full-validation-alerts > div > div > div > div")
	WebElement ErrorMsgPartialPostal;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-original-address-block_id-input\"]")
	WebElement OriginalAddress;
	@FindBy(xpath="//*[@id=\"a-autoid-6\"]/span/input")
	WebElement Saveaddress;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_12")
	WebElement Yukon;
	@FindBy(css="#address-ui-widgets-enterAddressFormContainer > div.a-checkbox.address-ui-widgets-checkbox-view.a-spacing-medium > label > span > span")
	WebElement ChkBoxMyDefaultAdd;
	@FindBy(css="#ya-myab-display-address-block-0 > div > div.a-section.a-spacing-none.default-section > span")
	WebElement DefaultBtn;
	@FindBy(css="#ya-myab-set-default-shipping-btn-1")
	WebElement SetDefaultBtn;
	@FindBy(css="#ya-myab-display-address-block-0 > div > div.a-section.address-section-with-default > div > div > span > a")
	WebElement AddDeliveryInstruction;
	@FindBy(css="#cdp-save-button > span > input")
	WebElement SaveInstructions;
	@FindBy(css="#address-ui-widgets-suggested-address-block_id-outer > label > span > div > span")
	WebElement SuggestionOption;
	public void clickYourAddressTab() {
	YourAddressTab.click();
}
public boolean YourAddressTittleDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(YourAddressesTittle));
	return YourAddressesTittle.isDisplayed();
}
public boolean AddAddressOptionDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(AddAddressOption));
	return AddAddressOption.isDisplayed();
}
public void ClickAddAddressOption() {
	AddAddressOption.click();
}
public void SelectDropdownoptionProvince() {
	ProvinceDropDown.click();
}
public boolean DefaultButtonDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(DefaultBtn));
	return DefaultBtn.isDisplayed();
}
	

public String countryDisplay() {
	return DropDown.getText();
}
public void validPhoneNumber() {
	PhoneNumber.sendKeys("4162770965");
}
public void PartialPhoneNumber() {
	PhoneNumber.sendKeys("41666");
}
public void ValidAddress() {
	AddressLine1.sendKeys("28 berberis cresecent");
}
public void validcity() {
	City.sendKeys("Brampton");
}
public void ClickValidProvince() {
	Ontario.click();
}
public void validPostalCode() {
		PostalCode.sendKeys("L7A0V4");
	}
	public void PartialPostalCode() {
		PostalCode.sendKeys("L7A");
	}
public void ClickAddress() {
	AddAddressBtn.click();
}
public void SelectOriginalAddress() {
	OriginalAddress.click();
	
}
public void ClickSaveChanges() {
	wait.until(ExpectedConditions.visibilityOf(Saveaddress));
	Saveaddress.click();
}
public boolean ErrorMsgName() {
	wait.until(ExpectedConditions.visibilityOf(ErrorFullname));
	return ErrorFullname.isDisplayed();
}
public void ValidFullname() {
	wait.until(ExpectedConditions.visibilityOf(FullName));
	FullName.sendKeys("Simranjeet Kaur");
}
public boolean ErrormsgDisplayPhone() {
	wait.until(ExpectedConditions.visibilityOf(ErrorMsgEmptyPhone));
	return ErrorMsgEmptyPhone.isDisplayed();
}
  public  boolean ErrormsgDisplayAddressEmpty() {
	wait.until(ExpectedConditions.visibilityOf(ErrorMsgAddressEmpty));
	  return ErrorMsgAddressEmpty.isDisplayed();}
public boolean SuccessmsgDisplay() {
	wait.until(ExpectedConditions.visibilityOf(AddressSaveSuccessMsg));
	return AddressSaveSuccessMsg.isDisplayed();}
public boolean ErrormsgPartialPostal() {
	wait.until(ExpectedConditions.visibilityOf(ErrorMsgPartialPostal));
	return ErrorMsgPartialPostal.isDisplayed();
}
public void SelectYukon() {
	Yukon.click();
}
public void InvalidCity() {
	City.sendKeys("Chandigarh");
}
public void ChkBoxSelected() {
	 ChkBoxMyDefaultAdd.click();
}
public void clicksetdeafultBtn() {
	wait.until(ExpectedConditions.elementToBeClickable(SetDefaultBtn));
	SetDefaultBtn.click();
}
public void Clickdeliveryservices() {
	AddDeliveryInstruction.click();
}
public void ClickSaveInstructions() {
	SaveInstructions.click();
}
public boolean SuggestionOptionDisplayed() {
	return SuggestionOption.isDisplayed();
}

}
