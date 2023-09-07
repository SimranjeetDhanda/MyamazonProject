package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.Pomloginandsecuritypage;
import PomPackage.Pomyourordersmodule;
import PomPackage.pomusername;
import PomPackage.pomyouraccountpage;

public class YourOrders extends Baseclass {
	pomyouraccountpage account;
	pomusername User;
	Pomloginandsecuritypage Login;
	Pomyourordersmodule Order;

	public YourOrders() {
		super();
	}

	@BeforeTest
	public void intitsetup() throws InterruptedException {
		initiate();
		account = new pomyouraccountpage();
		User = new pomusername();
		Login = new Pomloginandsecuritypage();
		Order = new Pomyourordersmodule();
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
		Order.ClickYourOrderTab();
		Thread.sleep(2000);

	}

	@Test(description = "Your orders_TC1_clicking on your orders")
	public void YourOrderPage() {
    
    Assert.assertTrue(Order.YourOrderTittleDisplay(),"Your order page is not displayed");
	}
	@Test(description="Your orders_TC2_past order history")
public void PastOrders() throws InterruptedException {
		
		Order.ClickPastOrdersTab();
		Thread.sleep(1000);
		Assert.assertTrue(Order.isPastOrdersDisplayed(), "past orders tab is not displayed");
	}
	@Test(description="Your orders_TC3_buy again option")
	public void BuyAgain() throws InterruptedException {
		
		Order.ClickBuyAgain();
		Thread.sleep(2000);
		Assert.assertTrue(Order.BuyAgainHeader(), "Buy again header is not displayed");
	}
	@Test(description="Your orders_TC4_not yet shipped")
	public void NotYetShippedOptions() throws InterruptedException {
		Order.ClickNotYetShipped();
		Thread.sleep(1000);
		Assert.assertTrue(Order.NoOrderMessageDisplay(), "No order messages are not dispplayed");
	}
	@Test(description="Your orders_TC5_cancelled orders")
	public void CancelledOrders() throws InterruptedException {
		Order.ClickCancelledOrders();
		Thread.sleep(1000);
		Assert.assertTrue(Order.DisplaySixMonthOrders(), "Cancelled orders message is not displayed");
	}
	@AfterTest
public void close() {
	driver.close();
}
}
