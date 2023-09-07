package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.pomusername;

public class UsernameTest extends Baseclass {
	pomusername User;
	public UsernameTest() {
	super();
}
@BeforeMethod
public void intitsetup() throws InterruptedException {
	initiate();
	User=new pomusername();
	driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fs%3Fk%3Damazon%2Bsign%2Bin%26hvadid%3D667601805835%26hvdev%3Dc%26hvlocphy%3D9000844%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D9728687363008147496%26hvtargid%3Dkwd-295921613490%26hydadcr%3D1759_13630548%26tag%3Dgoogcana-20%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
Thread.sleep(2000);
}
@Test(description="Already existing customer_TC1_invalid E-mail address or mobile number")
public void invalidusername() throws InterruptedException {
	User.typeusername("jeetsimrn");
	User.continuebtn();
	Thread.sleep(1000);
Assert.assertTrue(User.errormsgdisplayed(),"Error message not displayed");
}
@Test(description="Already existing customer_TC2_empty E-mail address or mobile number")
public void emptyusername() throws InterruptedException {
User.continuebtn();
Thread.sleep(2000);
Assert.assertTrue(User.alertmsgdisplayed(),"alert message not displayed");
}
@Test(description="Already existing customer_TC3_valid E-mail address or mobile number")
public void validusername() throws InterruptedException {
	 User.typeusername(prop.getProperty("username"));
	User.continuebtn();
	Thread.sleep(2000);
Assert.assertTrue(User.passwindowdisplayed(), "password window is not displayed");
	Thread.sleep(2000);
}
@Test(description="Already existing customer_TC4_invalid password field")
 public void invalidpassword() throws InterruptedException {
	User.typeusername(prop.getProperty("username"));
	User.continuebtn();
	User.typepassword("Dhand");
	User.signinbtn();
	Thread.sleep(2000);
	Assert.assertTrue(User.errormsgpassdisplayed(), "error message for wrong password is not displayed");
}
@Test(description="Already existing customer_TC5_empty password field")
public void emptypassword() throws InterruptedException {
	User.typeusername(prop.getProperty("username"));
	User.continuebtn();
	User.signinbtn();
	Thread.sleep(2000);
	Assert.assertTrue(User.alertmsgforpass(), "alert message for password is not displayed");
	Thread.sleep(1000);
}
@Test(description="Already existing customer_TC6_valid password field")
public void validPassword() throws InterruptedException {
	User.typeusername(prop.getProperty("username"));
	User.continuebtn();
	
	User.typepassword(prop.getProperty("password"));
	User.signinbtn();
	Thread.sleep(3000);
	Assert.assertTrue(User.HelloSignIn(),"not Displayed");}

@Test(description="Already existing customer_TC7_checked keep me signed in checkbox")
public void checkedKeepMeSignIn() throws InterruptedException {
	User.typeusername(prop.getProperty("username"));
	User.continuebtn();
	User.typepassword(prop.getProperty("password"));
	User.checkbox();
	User.signinbtn();
	User.HelloSignIn();
    driver.get("https://www.amazon.ca/");
Assert.assertTrue(User.HelloSignIn(), "not displayed");
Thread.sleep(2000);}



@AfterTest
 public void close() {
	 driver.close();
 }
	
	
	
	
	
}
