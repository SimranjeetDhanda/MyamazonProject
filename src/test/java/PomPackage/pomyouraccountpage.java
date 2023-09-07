package PomPackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasePackage.Baseclass;

public class pomyouraccountpage extends Baseclass{
//object repository
	// Text message that is shown as "Hello, <Username> Account & lists" message" 
@FindBy(css="#nav-link-accountList")
WebElement txtmsg;      
// email id or username field
@FindBy(id="ap_email")
WebElement Username;
// continue button
@FindBy(id="continue")
WebElement continuebtn;
// password field
@FindBy(id="ap_password")
WebElement passwrd;
// sign in button
@FindBy(id="signInSubmit")
WebElement signinbtn;
// object repository for homepage
@FindBy(id="CardInstanceGXB1sDcWo29Riqw58zo57w")
WebElement homepage;
// your account button
@FindBy(css="#nav-al-your-account > a:nth-child(2) > span")
WebElement youraccount;
// your account page 
@FindBy(css="#a-page > div.a-container > div")
WebElement youraccountpage;
	Actions action=new Actions(driver);	
public pomyouraccountpage() {
	PageFactory.initElements(driver, this);

}
// method to verify that text message is displayed
public boolean txtmsgverify() {
	wait.until(ExpectedConditions.visibilityOf(txtmsg));
	return txtmsg.isDisplayed();
}
// method to type in username field
public void typeusername(String name) {
	 Username.sendKeys(name);
	 }
// method to click on continue button
public void continuebtn() {
	continuebtn.click();
	}
// to password in password field
public void typepassword(String pass) {
	passwrd.sendKeys(pass);
	}
// to click on sign in button
public void signinbtn() {
	signinbtn.click();
}

// to verify that your account page is displayed
public boolean yourAccountDisplayed() {
return youraccountpage.isDisplayed();
}
// to mousehover on the text and to click on your account from the sublist
public void mousehovertxtmsg() {
	action.moveToElement(txtmsg).build().perform();
	youraccount.click();
}
}
	 
