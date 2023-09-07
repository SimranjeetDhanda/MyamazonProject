package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.pomGuestAccountPage;

public class GuestaccountTest extends Baseclass {
	pomGuestAccountPage Guest;
public GuestaccountTest() {
	super();
}
@BeforeMethod
public void  intiate(){
	initiate();
	Guest= new pomGuestAccountPage();
driver.get("https://www.amazon.ca/");
}
@Test(description="Guest Account_TC1_option of Guest account")
public void Searchproduct() {
	Guest.TypeinSearchBox();
    Guest.clickSearchBtn();
Assert.assertTrue(Guest.DisplaySearchResult(), "search results are not displayed");
}
@Test(description="Guest Account_TC2_option of Guest checkout")
public void Checkout() throws InterruptedException {
Guest.TypeinSearchBox();
Guest.clickSearchBtn();
Guest.selectproduct();
Thread.sleep(2000);
 Guest.clickBuyNowBtn(); 
  Assert.assertFalse(Guest.signInpgeDiplayed(), "sign in page is showing");
 }
@AfterMethod
public void close() {
	driver.close();
}
}
