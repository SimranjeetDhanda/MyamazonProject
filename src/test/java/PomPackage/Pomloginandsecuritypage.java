package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Baseclass;

public class Pomloginandsecuritypage extends Baseclass {
	// object repositories
	// your account tab
	@FindBy(css="#nav-al-your-account > a:nth-child(2) > span")
	WebElement youraccount;
	// text messge shown at the homepage with the customer name
	@FindBy(css="#nav-link-accountList")
	WebElement txtmsg;   
	// login and security tab
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
	WebElement loginSecuritytab;
	//Edit name tab
	@FindBy(id="auth-cnep-edit-name-button")
	WebElement EditNameTab;
	// save changes button
	@FindBy(id="cnep_1C_submit_button")
	WebElement SaveChanges;
	// success message
	@FindBy(css="#auth-success-message-box > div > div > ul > li > span")
    WebElement Successmsg;

Actions action=new Actions(driver);	
public Pomloginandsecuritypage() {
	PageFactory.initElements(driver, this);
}
public void mousehovertxtmsg() {
	action.moveToElement(txtmsg).build().perform();
	youraccount.click();
}
public void ClickLoginandSecurity() {
	
	loginSecuritytab.click();
}
public void ClickEditNameTab() {
	EditNameTab.click();
}
public void ClickSaveChanges() {
	SaveChanges.click();
}
public String GetSuccessmsg() {
	 return Successmsg.getText();
}

}