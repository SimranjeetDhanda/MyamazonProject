package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.pomShoppingcartpage;

public class ShoppingcartTest extends Baseclass{
	pomShoppingcartpage shopping;
public ShoppingcartTest() {
	super();
}
@BeforeMethod
	public void intiate() {
	initiate();
	 shopping=new pomShoppingcartpage();
	 driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317597040173&hvpos=&hvnetw=g&hvrand=13852077598265508082&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000847&hvtargid=kwd-360364904397&ref=pd_sl_2gqjnc4wf3_e&hydadcr=11828_10790061");
}
	

@Test(description="Shopping cart_TC1_update and verification of product")
public void verifyProduct() throws InterruptedException {
	
	shopping.TypeinSearchBox();
	shopping.clickSearchBtn();
	Thread.sleep(2000);
	shopping.selectproduct();
	shopping.addToCart();
	shopping.clickNoProtection();
	Assert.assertTrue(shopping.itemFeatureDisplay(),"item features are not displayed" );
}
@Test(description="Shopping cart_TC2_price adjustment according quantity")
public void Quanityverification() throws InterruptedException {
	
	shopping.TypeinSearchBox();
	shopping.clickSearchBtn();
	shopping.selectproduct();
	shopping.addToCart();
	shopping.clickNoProtection();
	shopping.ClickGoToCart();
	shopping.clickquantity();
	shopping.enterQuantities();
	Assert.assertTrue(shopping.totalamount(), "total amount is not shown");
}

@Test(description="Shopping cart_TC3_one item with multiple quantity")
public void priceverification() throws InterruptedException {

	shopping.TypeinSearchBox();
	
	shopping.clickSearchBtn();
	Thread.sleep(1000);
	shopping.selectproduct();
	
	shopping.addToCart();
	
	shopping.clickNoProtection();
		
	shopping.ClickGoToCart();
	
	shopping.clickquantity();
	shopping.enterQuantities();
	Thread.sleep(1000);
	Assert.assertTrue(shopping.displayupdatedQty(), "updated quantity is shown");}
@Test(description="Shopping cart_TC4_feature of products  displayed on the page")
public void featuresOfProducts() throws InterruptedException {
Thread.sleep(1000);
shopping.TypeinSearchBox();
	
	shopping.clickSearchBtn();
	Thread.sleep(1000);
	shopping.selectproduct();
	shopping.addToCart();
	shopping.clickNoProtection();
	Thread.sleep(1000);
	shopping.Typesecondproduct();
	Thread.sleep(1000);
	shopping.clickSearchBtn();
	Thread.sleep(1000);
	shopping.ClickSecondProduct();
	shopping.addToCart();
	shopping.ClickGoToCart();
	Thread.sleep(2000);
	Assert.assertTrue(shopping.featuresofItems(), "features of products are not shown");
}
@Test(description="Shopping cart_TC5_ removal of a item")
public void removalOfItem() throws InterruptedException {
	shopping.TypeinSearchBox();
	Thread.sleep(1000);
	shopping.clickSearchBtn();
	shopping.selectproduct();
    Thread.sleep(1000);
	shopping.addToCart();
	Thread.sleep(1000);
	shopping.clickNoProtection();
	Thread.sleep(1000);
	shopping.Typesecondproduct();
	shopping.clickSearchBtn();
	shopping.ClickSecondProduct();
	shopping.addToCart();
	shopping.ClickGoToCart();
	shopping.clickquantity();
     shopping.RemoveItem();
	Thread.sleep(2000);
     Assert.assertTrue(shopping.DisplayRemaningItems(), "remaining items are not displayed");}

@Test(description="Shopping cart_TC7_ more information about the product")
public void InfoAboutProduct() throws InterruptedException {
	Thread.sleep(1000);
	shopping.TypeinSearchBox();
	Thread.sleep(2000);
	shopping.clickSearchBtn();
	shopping.selectproduct();
Assert.assertTrue(shopping.productinfo(), " product info is not shown");
}
 @Test(description="Shopping cart_TC8_ can cart hold the products")   
 public void HoldingItems() throws InterruptedException {
 shopping.TypeinSearchBox();
	shopping.clickSearchBtn();
	shopping.selectproduct();
	shopping.addToCart();
	shopping.clickNoProtection();
shopping.ClickGoToCart();
	driver.get("https://www.amazon.ca/");
 Thread.sleep(2000);
 
 Assert.assertTrue(shopping.DisplaycartwithItems(), "product is not in the cart");
 }



@AfterMethod
public void close() {
	driver.close();
}}
