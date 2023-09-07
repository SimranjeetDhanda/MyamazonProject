package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.pomusername;
import PomPackage.pomyouraccountpage;

public class Youraccountmodule extends Baseclass {
	pomyouraccountpage account;
	pomusername	User;
	public Youraccountmodule() {
	super();
}
@BeforeMethod
public void intiate() throws InterruptedException {
	initiate();
	account=new pomyouraccountpage();
			User=new pomusername();
driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fs%3Fk%3Damazon%2Bsign%2Bin%26hvadid%3D604543010316%26hvdev%3Dc%26hvlocphy%3D9000844%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D14812325187517160666%26hvtargid%3Dkwd-295921613490%26hydadcr%3D1759_13518035%26tag%3Dgoogcana-20%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
Thread.sleep(2000);
}
@Test(description="Your Account module_TC1_verify the Hello, <Username> Account & lists message and information")
public void verifymsg() {
	User.typeusername(prop.getProperty("username"));
	User.continuebtn();
	User.typepassword(prop.getProperty("password"));
	User.signinbtn();
Assert.assertTrue(account.txtmsgverify(), "text message is not displayed");
	}
@Test(description="Your Account module_TC2_ability to click on Hello, <Username> Account & lists link")
public void clicktxtmsg() throws InterruptedException {
User.typeusername(prop.getProperty("username"));
User.continuebtn();
User.typepassword(prop.getProperty("password"));
User.signinbtn();
Thread.sleep(2000);
account.mousehovertxtmsg();
Thread.sleep(2000);
Assert.assertTrue(account.yourAccountDisplayed(), "your account page is not displayed");
}

@AfterTest
public void close() {
	driver.close();
}

}
	
	
	
	
	
	
	
	
	

