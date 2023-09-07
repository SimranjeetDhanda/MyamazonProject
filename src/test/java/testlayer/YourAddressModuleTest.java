package testlayer;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.Pomyouraddressmodule;
import PomPackage.pomusername;
import PomPackage.pomyouraccountpage;

public class YourAddressModuleTest extends Baseclass{
	pomyouraccountpage account;
	pomusername User;
	Pomyouraddressmodule address;
	
	public YourAddressModuleTest() {
		super();
	}

	@BeforeTest
	public void intitsetup() throws InterruptedException {
		initiate();
		account = new pomyouraccountpage();
		User = new pomusername();
		address=new Pomyouraddressmodule();

		
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fs%3Fk%3Damazon%2Bsign%2Bin%26hvadid%3D667601805835%26hvdev%3Dc%26hvlocphy%3D9000844%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D18285611722827060278%26hvtargid%3Dkwd-295921613490%26hydadcr%3D1759_13630548%26tag%3Dgoogcana-20%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
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
		address.clickYourAddressTab();
}
	@Test(description="your address_TC1_Your address tittle")
	public void iYourAddressTittleDisplayed() {
		
		Assert.assertTrue(address.YourAddressTittleDisplayed(), "your address tittle is not displayed");
	}
  @Test(description="your address_TC2_add address option")	
  public void ISAddAddressOptionDisplayed() throws InterruptedException {
	 
	  Thread.sleep(1000);
	  Assert.assertTrue(address.AddAddressOptionDisplayed(), "Add address option is not displayed");
  }
  @Test(description="your address_TC3_add address option")
  public void AutoselectedCountry() throws InterruptedException {
	  Thread.sleep(1000);
	  address.ClickAddAddressOption();
	Assert.assertEquals(address.countryDisplay(),"Canada","Canada is not displayed");
	   }
  @Test(description="your address_TC4_empty full name field")
  public void EmptyFullName() throws InterruptedException {
	  address.ClickAddAddressOption();
   address.validPhoneNumber();
	  address.ValidAddress();
	  address.validcity();
	   address.SelectDropdownoptionProvince();
	  address.ClickValidProvince();
	   address.validPostalCode();
	  Thread.sleep(1000);
	  address.ClickAddress();
	  Assert.assertTrue(address.ErrorMsgName(), "Error message is not displayed");
  }
  @Test(description="your address_TC5_empty phone number field")
  public void EmptyPhoneNumber() throws InterruptedException {
	  address.ClickAddAddressOption();
	  address.ValidFullname();
	   address.ValidAddress();
	  address.validcity();
	 address.SelectDropdownoptionProvince();
	  address.ClickValidProvince();
	  address.validPostalCode();
	  Thread.sleep(1000);
	  address.ClickAddress();
	  Assert.assertTrue(address.ErrormsgDisplayPhone(), "error message is not displayed");
  }
  @Test(description="your address_TC6_empty Address field")
  public void EmptyAddressLine1() throws InterruptedException {
	  address.ClickAddAddressOption();
	  address.ValidFullname();
	  address.validPhoneNumber();
	  address.validcity();
	   address.SelectDropdownoptionProvince();
	  address.ClickValidProvince();
	  
	  address.validPostalCode();
	  Thread.sleep(1000);
	  address.ClickAddress();
	  Assert.assertTrue(address.ErrormsgDisplayAddressEmpty(), "error message is not displayed");
  }
  @Test(description="your address_TC7_ partial phone number")
  public void partialPhoneNumber() throws InterruptedException {
	  address.ClickAddAddressOption();
	  
	  address.ValidFullname();
	  address.PartialPhoneNumber();
	   address.ValidAddress();
	  address.validcity();
	  address.SelectDropdownoptionProvince();
	  address.ClickValidProvince();
	   address.validPostalCode();
	  address.ClickAddress();
	  
	  address.SelectOriginalAddress();
	 
	  Thread.sleep(3000);
	  address.ClickSaveChanges();
	  
	  Assert.assertFalse(address.SuccessmsgDisplay(), "Error message is showing");
  }
  @Test(description="your address_TC8_ partial postal code")
  public void PartialPostalCode() throws InterruptedException {
	  address.ClickAddAddressOption();
	  
	  address.ValidFullname(); 
	  address.validPhoneNumber();
	 address.ValidAddress();
	  address.validcity();
	 address.SelectDropdownoptionProvince();
	   address.ClickValidProvince();
	 address.PartialPostalCode();
	 address.ClickAddress();
	   address.SelectOriginalAddress();
	  Thread.sleep(1000);
	  address.ClickSaveChanges();
	  Assert.assertTrue(address.ErrormsgPartialPostal(), "Error message is not showing");
	 
  }
  @Test(description="your address_TC9_ different province")
  public void InvalidProvince() throws InterruptedException {
	  address.ClickAddAddressOption();
 
  address.ValidFullname(); 
  address.validPhoneNumber();
  
  address.ValidAddress();
  address.validcity();
 address.SelectDropdownoptionProvince();
  address.SelectYukon();
 address.validPostalCode();
address.ClickAddress();
  address.SelectOriginalAddress();
  Thread.sleep(1000);
  address.ClickSaveChanges();
  Assert.assertTrue(address.ErrormsgPartialPostal(), "error message is not showing");
  }
  @Test(description="your address_TC10_ city from outside canada")
 public void InvalidCity() throws InterruptedException {
	  address.ClickAddAddressOption();
 
  address.ValidFullname(); 
  address.validPhoneNumber();

  address.ValidAddress();
  address.InvalidCity();
 address.SelectDropdownoptionProvince();
 address.ClickValidProvince();
 address.validPostalCode();
  address.ClickAddress();
 address.SelectOriginalAddress();
  Thread.sleep(1000);
  address.ClickSaveChanges();
  Assert.assertFalse(address.SuccessmsgDisplay(), "Error message is showing");
  }
  @Test(description="your address_TC11_ making default address") 
 public void DefaultAddress() throws InterruptedException{
	  address.ClickAddAddressOption();
	   address.ValidFullname(); 
	   address.validPhoneNumber();
	   address.ValidAddress();
	   address.validcity();
	   address.SelectDropdownoptionProvince();
	   address.ClickValidProvince();
	   address.validPostalCode();
	   address.ChkBoxSelected();
	   address.ClickAddress();
	   address.SelectOriginalAddress();
	   
	  address.ClickSaveChanges();
Assert.assertTrue(address.DefaultButtonDisplayed(), " default button is not displaying");
  } 
  
  @Test(description="your address_TC12_ making default address")
	public void DefaultAddress2ndOption() throws InterruptedException {
	  address.clicksetdeafultBtn();
	  Thread.sleep(1000);
	  Assert.assertTrue(address.DefaultButtonDisplayed(), " default button is not displaying");
	   
  }
  @Test(description="your address_TC13_ add additional delivery instructions")
  public void AddDeliverInstructions() throws InterruptedException {
	  address.Clickdeliveryservices();
	  Thread.sleep(1000);
	  address.ClickSaveInstructions();
  }
  @Test(description="your address_TC14_ added addresses")
	public void AddressSave() throws InterruptedException {
	address.ClickAddAddressOption();
  address.ValidFullname(); 
   address.validPhoneNumber();
   address.ValidAddress();
   address.validcity();
   address.SelectDropdownoptionProvince();
   address.ClickValidProvince();
   address.validPostalCode();
   address.ClickAddress();
    address.ClickSaveChanges();
   Assert.assertTrue(address.SuccessmsgDisplay(), "address is not saved");}
@Test(description="your address_TC15_ address suggestion")
public void AddressSuggestion() throws InterruptedException {
	address.ClickAddAddressOption();
	  address.ValidFullname(); 
	   address.validPhoneNumber();
	   address.ValidAddress();
	   address.validcity();
	    address.SelectDropdownoptionProvince();
	   address.ClickValidProvince();
	   address.validPostalCode();
	   address.ClickAddress();
	   Assert.assertTrue(address.SuggestionOptionDisplayed(), "Suggestion option is not displayed");
}
		  
		  
		  @AfterTest 
	public void close() { 
		  driver.close(); }
	 


}
