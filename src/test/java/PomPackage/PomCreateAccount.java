package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.Baseclass;


public class PomCreateAccount extends Baseclass{
	public PomCreateAccount() {
		   PageFactory.initElements(driver, this);}
@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
WebElement FullNameField;
@FindBy(xpath="//*[@id=\"ap_email\"]")
WebElement MobileNoOrEmail;
@FindBy(xpath="//*[@id=\"ap_password\"]")
WebElement PasswordField;
@FindBy(xpath="//*[@id=\"ap_password_check\"]")
WebElement PasswordagainField;
@FindBy(xpath="//*[@id=\"continue\"]")
WebElement ContinueBtn;

@FindBy(xpath="//*[@id=\"cvf-input-code\"]")
WebElement EnterOtP;
@FindBy(xpath="//*[@id=\"auth-customerName-missing-alert\"]/div/i")
WebElement ErrorEmptyName;
@FindBy(xpath="//*[@id=\"auth-email-missing-alert\"]/div/div")
WebElement ErrorMsgEmptyEmail;
@FindBy(xpath="//*[@id=\"auth-email-invalid-claim-alert\"]/div/div")
WebElement ErrorMsgPartialEmail;
@FindBy(xpath="//*[@id=\"auth-error-message-box\"]/div")
WebElement ErrorPartialPhone;
@FindBy(xpath="//*[@id=\"auth-password-invalid-password-alert\"]/div/div")
WebElement InvalidPasswordMsg;
@FindBy(xpath="//*[@id=\"auth-password-mismatch-alert\"]/div/div")
WebElement ErrorMsgPasswordmatch; 
@FindBy(xpath="//*[@id=\"register-mase-inlineerror\"]/div/div")
WebElement ErrorMsgExistingEmail;

public void TypeValidFirstName(){
	wait.until(ExpectedConditions.visibilityOf(FullNameField));
	FullNameField.sendKeys("Simran");
}

public boolean ErrorMsgExistingEmaildisplayed() {
	wait.until(ExpectedConditions.visibilityOf(ErrorMsgExistingEmail));
	return ErrorMsgExistingEmail.isDisplayed();
}
public void EnterExistingEmail() {
	wait.until(ExpectedConditions.visibilityOf(MobileNoOrEmail));
	MobileNoOrEmail.sendKeys("jeetsimrn123@gmail.com");
}
public boolean Errormsgpasswordmismatch() {
	 wait.until(ExpectedConditions.visibilityOf(ErrorMsgPasswordmatch));
	return ErrorMsgPasswordmatch.isDisplayed();
}
public boolean InvalidPasswordMsgDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(InvalidPasswordMsg));
	return InvalidPasswordMsg.isDisplayed();
}
public boolean ErrorMsgDisplayedPhonePartial() {
	wait.until(ExpectedConditions.visibilityOf(ErrorPartialPhone));
	return ErrorPartialPhone.isDisplayed();
}
public void EnterInvalidPassword() {
	wait.until(ExpectedConditions.visibilityOf(PasswordagainField));
	PasswordField.sendKeys("Dhand");
}
public void EnterInvalidpasswordAgaian() {
	wait.until(ExpectedConditions.visibilityOf(PasswordagainField));
	PasswordagainField.sendKeys("Dhand");
}
public void EnterPartialMobile() {
	wait.until(ExpectedConditions.visibilityOf(MobileNoOrEmail));
	MobileNoOrEmail.sendKeys("416");
}
public boolean ErrorMsgPartialEmail() {
	wait.until(ExpectedConditions.visibilityOf(ErrorMsgPartialEmail));
	return ErrorMsgPartialEmail.isDisplayed();
}
public void TypeValidEmailAddress() {
	wait.until(ExpectedConditions.visibilityOf(MobileNoOrEmail));
	MobileNoOrEmail.sendKeys("lakhisohi123@gmail.com");
}
public void partialemail() {
	wait.until(ExpectedConditions.visibilityOf(MobileNoOrEmail));
	MobileNoOrEmail.sendKeys("jeeetss");
	
}
public boolean ErrorMsgEmptyEmailDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(ErrorMsgEmptyEmail));
	return ErrorMsgEmptyEmail.isDisplayed();
}
public void validFillPassword() {
	wait.until(ExpectedConditions.visibilityOf(PasswordField));
	PasswordField.sendKeys("Dhanda@1");
}
public void FillValidPasswordagain() {
	wait.until(ExpectedConditions.visibilityOf(PasswordagainField));
PasswordagainField.sendKeys("Dhanda@1");
}
public void ClickContinueBtn() {
wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
	ContinueBtn.click();
}

public boolean EnterOtpDispplayed() {
	wait.until(ExpectedConditions.visibilityOf(EnterOtP));
	return EnterOtP.isDisplayed();
}
public boolean ErrorNameDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(ErrorEmptyName));
	return ErrorEmptyName.isDisplayed();
}
}