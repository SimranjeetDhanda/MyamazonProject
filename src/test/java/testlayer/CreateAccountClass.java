package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.PomCreateAccount;
import PomPackage.pomShoppingcartpage;


public class CreateAccountClass extends Baseclass {
	PomCreateAccount create;
	public CreateAccountClass() {
		super();
	}
	@BeforeMethod
		public void intiate() {
		initiate();
		 create=new PomCreateAccount();
		driver.navigate().to("https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fs%2F%3F_encoding%3DUTF8%26hvadid%3D232545078680%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9000844%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D17373338363357331646%26hvtargid%3Dkwd-495601062472%26hydadcr%3D3316_10311010%26ie%3DUTF8%26index%3Daps%26keywords%3Damazon%2520create%2520account%26ref%3Dpd_sl_1w1bkaujqp_e%26tag%3Dgoogcana-20%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"); 
	}

@Test(description="Create Account_TC1_create account with valid information")
public void accountCreation() throws InterruptedException {
create.TypeValidFirstName();
create.TypeValidEmailAddress();
create.validFillPassword();
create.FillValidPasswordagain();
create.ClickContinueBtn();
Thread.sleep(1000);
Assert.assertTrue(create.EnterOtpDispplayed(), "Enter Otp is not displayed");
}
@Test(description="Create Account_TC2_Empty Your name field")
public void EmptyName() {
	create.TypeValidEmailAddress();
	create.validFillPassword();
	create.FillValidPasswordagain();
	create.ClickContinueBtn();
	Assert.assertTrue(create.ErrorNameDisplayed(), "error message is not displayed");
}
@Test(description="Create Account_TC3_empty Mobile number or email field")
public void EmptyEmail() throws InterruptedException {
	create.TypeValidFirstName();
	create.validFillPassword();
	create.FillValidPasswordagain();
	create.ClickContinueBtn();
	Thread.sleep(1000);
	Assert.assertTrue(create.ErrorMsgEmptyEmailDisplayed(), "error message is not displayed");

}
@Test(description="Create Account_TC5_prtial email number")
public void PartialEmail() throws InterruptedException {
	create.TypeValidFirstName();
	create.partialemail();
	create.validFillPassword();
	create.FillValidPasswordagain();
	create.ClickContinueBtn();
	Thread.sleep(2000);
Assert.assertTrue(create.ErrorMsgPartialEmail(), "error message is not displayed");
}
@Test(description="Create Account_TC4_partial mobile number")
public void partialMObileNo() {
	create.TypeValidFirstName();
create.EnterPartialMobile();
	create.validFillPassword();
	create.FillValidPasswordagain();
	create.ClickContinueBtn();
Assert.assertTrue(create.ErrorMsgDisplayedPhonePartial(), "error message is not displayed");
}
@Test(description="Create Account_TC6_valid password" )
public void accountCreationValid() {
create.TypeValidFirstName();
create.TypeValidEmailAddress();
create.validFillPassword();
create.FillValidPasswordagain();
create.ClickContinueBtn();
Assert.assertTrue(create.EnterOtpDispplayed(), "Enter Otp is not displayed");
}

@Test(description="Create Account_TC7_invalid password")
public void InvalidPassword() {
	create.TypeValidFirstName();
	create.TypeValidEmailAddress();
create.EnterInvalidPassword();
create.EnterInvalidpasswordAgaian();
create.ClickContinueBtn();
Assert.assertTrue(create.InvalidPasswordMsgDisplayed(), "error message is not displayed");
}
@Test(description="Create Account_TC8_same password and password again field")
public void ValidPasswordFields() {
create.TypeValidFirstName();
create.TypeValidEmailAddress();
create.validFillPassword();
create.FillValidPasswordagain();
create.ClickContinueBtn();
Assert.assertTrue(create.EnterOtpDispplayed(), "Enter Otp is not displayed");
}
@Test(description="Create Account_TC9_different password and password again field")
public void DifferentPasswordagainField() {
	create.TypeValidFirstName();
	create.TypeValidEmailAddress();
	create.validFillPassword();
    create.EnterInvalidpasswordAgaian();
    create.ClickContinueBtn();
Assert.assertTrue(create.Errormsgpasswordmismatch(), "error message is not displayed");
}
@Test(description="Create Account_TC10_already existing account")
public void ExistingAccount(){
create.TypeValidFirstName();
create.EnterExistingEmail();
create.validFillPassword();
create.FillValidPasswordagain();
create.ClickContinueBtn();
Assert.assertTrue(create.ErrorMsgExistingEmaildisplayed(), "error message is not displayed");
}
@AfterMethod
public void close() {
	driver.close();
}
}
