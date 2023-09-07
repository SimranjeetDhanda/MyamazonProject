package testlayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.Pomsearchingmodule;
import PomPackage.pomShoppingcartpage;

public class SearchingTest extends Baseclass {
	pomShoppingcartpage shopping;
	Pomsearchingmodule searching;
	public SearchingTest(){
		super();
	}
		@BeforeMethod
		public void intiate() {
		initiate();
		 shopping=new pomShoppingcartpage();
         searching=new Pomsearchingmodule();
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=231037566931&hvpos=&hvnetw=g&hvrand=1619608120732456568&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000844&hvtargid=kwd-360364904397&ref=pd_sl_2gqjnc4wf3_e&hydadcr=11828_10129635");
		}

@Test(description="Searching_TC1_search with keyword")
public void SearchWithKeyword() throws InterruptedException {
	searching.SerachKeyword();
	shopping.clickSearchBtn();
	Thread.sleep(1000);
	searching.scrolldown();
	Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC2_search with description text")
public void SearchwithDescriptionText() {
	searching.SendKeysDescription();
	shopping.clickSearchBtn();
	searching.scrolldown();
	Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC3_search with partial item text" )
public void SearchWithPartialText() {
	searching.SendKeysPartialText();
	shopping.clickSearchBtn();
	searching.scrolldown();
	Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC4_search with item number"  )
public void SearchWithItemNumber() throws InterruptedException {
	
	Thread.sleep(1000);
	searching.SendKeysForAsin();
	shopping.clickSearchBtn();
	searching.scrolldown();
	Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC5_search with partial item number")
public void SearchwithPartialItemsNumber() throws InterruptedException {
	Thread.sleep(1000);
	searching.SendKeysForPartialAsin();
	Thread.sleep(1000);
	shopping.clickSearchBtn();
	Thread.sleep(1000);
	
	Assert.assertTrue(searching.SearchResult2Displayed(), "Search results are not displayed");
}
@Test (description="Searching_TC6_search with category keyword ")
public void SearchWithCategory() throws InterruptedException {
Thread.sleep(1000);
searching.SendKeysCategory();
shopping.clickSearchBtn();
searching.scrolldown();
Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC7_search results page")
public void SearchPage() throws InterruptedException {
searching.SerachKeyword();
shopping.clickSearchBtn();
Thread.sleep(1000);
searching.scrolldown();
Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC8_relevant product display")

public void RelevantProducts() throws InterruptedException {
searching.SerachKeyword();
shopping.clickSearchBtn();
Thread.sleep(1000);
searching.scrolldown();
Assert.assertTrue(searching.SearchResultDisplayed(), "Search results are not displayed");
}
@Test(description="Searching_TC9_display product related information")
public void productinformation() throws InterruptedException {
Thread.sleep(1000);
	searching.SerachKeyword();
shopping.clickSearchBtn();
Thread.sleep(1000);
searching.ScrollDownToProdcutInfo();
Assert.assertTrue(searching.ProductImageandFeaturesDisplayed(), "product image and features are not displayed");
}

@Test(description="Searching_TC10_default number of products on page")
public void NumberOfProducts() throws InterruptedException {
Thread.sleep(2000);
	searching.SerachKeyword();
shopping.clickSearchBtn();
Thread.sleep(1000);
Assert.assertEquals(searching.DisplayNumberOfProdcuts(), "1-60 of over 60,000 results for");}


@Test(description="Searching_TC11_Next button for page" )
public void NextButtonFunctionality() throws InterruptedException {
	Thread.sleep(1000);
	searching.SerachKeyword();
shopping.clickSearchBtn();
Thread.sleep(1000);

searching.scrolltoNextBtn();
Thread.sleep(3000);
searching.ClickNextBtn();
Thread.sleep(3000);
searching.scrolltoSecondPage();
Thread.sleep(1000);
}



@AfterTest
public void close() {
	driver.close();
}

}