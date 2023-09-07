package PomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasePackage.Baseclass;

public class pomusername extends Baseclass {

	
	
	//object repository 
	@FindBy(id="ap_email")
WebElement Username;
@FindBy(id="continue")
WebElement continuebtn;
@FindBy(id="auth-error-message-box")
WebElement errormsg;
@FindBy(id="auth-email-missing-alert")
WebElement alertmsg;
@FindBy(id="authportal-main-section")
WebElement passwindow;
@FindBy(id="ap_password")
WebElement passwrd;
@FindBy(id="signInSubmit")
WebElement signinbtn;
@FindBy(id="auth-error-message-box")
WebElement errormsgpass;
@FindBy(id="auth-password-missing-alert")
WebElement alertMissPassword;

@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
WebElement BtnSignInHomePage;
@FindBy(xpath="//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div/form/div/div[2]/div/div/label/div/label/input")
WebElement chkbox;
@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
WebElement HelloCustomerName;
Actions action=new Actions(driver);	
//


// initiate page elements
public boolean HomePageSignInButton() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"nav-flyout-ya-signin\\\"]/a/span")));
	return BtnSignInHomePage.isDisplayed();
}

public pomusername() {
	PageFactory.initElements(driver, this);
}
public void typeusername(String name) {
	 Username.sendKeys(name);

}
public boolean errormsgdisplayed() {
	wait.until(ExpectedConditions.visibilityOf(errormsg));
	return  errormsg.isDisplayed();
}
public boolean alertmsgdisplayed() {
	wait.until(ExpectedConditions.visibilityOf(alertmsg));
	return alertmsg.isDisplayed();
}
public void continuebtn() {
	continuebtn.click();

}
public boolean passwindowdisplayed() {
	wait.until(ExpectedConditions.visibilityOf(passwindow));
	return passwindow.isDisplayed();
}
public void typepassword(String pass) {
	passwrd.sendKeys(pass);
	
}
public void signinbtn() {
	signinbtn.click();
}
public boolean errormsgpassdisplayed() {
	wait.until(ExpectedConditions.visibilityOf(errormsgpass));
	return errormsgpass.isDisplayed();
}
public boolean alertmsgforpass() {
	wait.until(ExpectedConditions.visibilityOf(alertMissPassword));
	return alertMissPassword.isDisplayed();
}
public boolean HelloSignIn() {
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-link-accountList\"]")));
action.moveToElement(HelloCustomerName).build().perform();
return HelloCustomerName.isDisplayed();

}


public void checkbox() {
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div/form/div/div[2]/div/div/label/div/label/input")));
	chkbox.click();
}
public void checkboxSelected() {
	chkbox.isSelected();
}

}

