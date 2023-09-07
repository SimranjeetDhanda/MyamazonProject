package testlayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.Pomloginandsecuritypage;
import PomPackage.pomusername;
import PomPackage.pomyouraccountpage;

public class LoginAndSecurityTest extends Baseclass {
pomyouraccountpage account;
pomusername User;
Pomloginandsecuritypage Login;
public LoginAndSecurityTest() {
	super();
}
@BeforeTest
public void intitsetup() throws InterruptedException {
	initiate();
	account=new pomyouraccountpage();
    User=new pomusername();
    Login=new Pomloginandsecuritypage();
	driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fs%3Fk%3Damazon%2Bsign%2Bin%26hvadid%3D667601805835%26hvdev%3Dc%26hvlocphy%3D9000844%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D18285611722827060278%26hvtargid%3Dkwd-295921613490%26hydadcr%3D1759_13630548%26tag%3Dgoogcana-20%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	Thread.sleep(1000);
	
}
@Test(description="Login and security_TC1_update login information- changes in name")
public void AbilitytoAddItems() throws InterruptedException {
	// type username
	User.typeusername(prop.getProperty("username"));
	// click continue button
	User.continuebtn();
	// type password
	User.typepassword(prop.getProperty("password"));
	// click sign in button
	User.signinbtn();
	Thread.sleep(2000);
	// mousehover and click on your account tab
	account.mousehovertxtmsg();
	// click login and security tab
	Login.ClickLoginandSecurity();
	// click edit name tab
	Login.ClickEditNameTab();
	// click save changes
	Login.ClickSaveChanges();
	// assertion to check whether changes are made not 
	Assert.assertEquals(Login.GetSuccessmsg(),"You successfully changed your account!", "success msg is not shown");
}
@AfterTest
public  void close() {
	driver.close();
}

}







