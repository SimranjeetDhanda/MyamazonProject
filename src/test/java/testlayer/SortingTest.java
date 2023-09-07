package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Baseclass;
import PomPackage.Pomsearchingmodule;
import PomPackage.Pomsortingandfilteration;
import PomPackage.pomShoppingcartpage;

public class SortingTest extends Baseclass {
	Pomsortingandfilteration sort;
	pomShoppingcartpage shopping;
	Pomsearchingmodule searching;
	public SortingTest(){
		super();
	}
		@BeforeMethod
		public void intiate() {
		initiate();
		 sort=new Pomsortingandfilteration();
		 shopping=new pomShoppingcartpage();
         searching=new Pomsearchingmodule();
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=231037566931&hvpos=&hvnetw=g&hvrand=1619608120732456568&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000844&hvtargid=kwd-360364904397&ref=pd_sl_2gqjnc4wf3_e&hydadcr=11828_10129635");
		}
@Test(description="filteration_TC1_available filters")
public void Filters() throws InterruptedException {
	
	searching.SerachKeyword();
shopping.clickSearchBtn();
Thread.sleep(1000);
Assert.assertTrue(sort.DisplayCustomerReviewFilter(), "filters are showing");
}
@Test(description="Sorting_TC1_sorting options")
public void SortOptions() throws InterruptedException {

searching.SerachKeyword();
shopping.clickSearchBtn();
sort.ClickSortOption();
Thread.sleep(2000);
Assert.assertTrue(sort.DisplaySortOptions(),"sort option is not displayed");
}
@Test(description="Sorting_TC2_sorting options")
public void ClickSortingOption() throws InterruptedException {
	searching.SerachKeyword();
	shopping.clickSearchBtn();
	sort.ClickSortOption();	
	sort.ClickHighToLow();
	Thread.sleep(1000);	Assert.assertTrue(sort.DisplayResultSort(), "sort results are not displayed");
}
@Test(description="Sorting and filtering_TC1_sorting options")
public void FilterAndSort() throws InterruptedException {
	
	searching.SerachKeyword();
	shopping.clickSearchBtn();
	sort.ClickSortOption();	
	sort.ClickHighToLow();
	sort.ClickFilterFreeShip();
    Thread.sleep(1000);
    Assert.assertTrue(sort.DisplayFilterSort(), "Filter sort can not be applied together");
}

@Test(description="Sorting and filtering_TC2_repetition of products on the page")
public void repetitionofProducts() throws InterruptedException {
	
	searching.SerachKeyword();
	shopping.clickSearchBtn();
	sort.ClickSortOption();	
sort.ClickHighToLow();
	sort.ClickFilterFreeShip();
    Thread.sleep(2000);
	Assert.assertTrue(sort.SortFilterItemCount(), "more than 1 item found");
}
@Test(description= "pagination_TC1_ no duplicate products")
public void DuplicateProducts() throws InterruptedException {
	
	searching.SerachKeyword();
	shopping.clickSearchBtn();
	Thread.sleep(1000);
	Assert.assertTrue(sort.ItemsTextCount(), "more than 1 Items");
}
@AfterTest
public void close() {
	driver.close();
}








}
