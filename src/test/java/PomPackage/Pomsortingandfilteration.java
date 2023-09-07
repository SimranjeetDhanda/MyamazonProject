package PomPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasePackage.Baseclass;

public class Pomsortingandfilteration extends Baseclass{
	
	@FindBy(xpath="//*[@id=\"reviewsRefinements\"]")
	WebElement CustomerReview;
	@FindBy(xpath="//*[@id=\"brandsRefinements\"]/ul")
	WebElement FeaturedBrands;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/span[2]")
	WebElement SortOption;
	@FindBy(xpath="//*[@id=\"a-popover-2\"]/div/div")
	WebElement SortOptionsBox;
	@FindBy(xpath="//*[@id=\"s-result-sort-select_2\"]")
	WebElement PriceHighToLowOption;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/span/div/div/span")
	WebElement ResultsSort;
	@FindBy(xpath="//*[@id=\"p_76/3276484011\"]/span/a/div[1]/label/i")
	WebElement FilterFreeShip;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t3.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(12) > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")
	WebElement FilterSortResult;
	@FindBys(
			{@FindBy(className="sg-col-inner")})
	List<WebElement> itemelements;
	@FindBys(
			{@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")})
	      List<WebElement> ItemsProductText;
    public boolean ItemsTextCount() {return ItemsProductText.size()==1;}
   @FindBys(
		   {@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/h2/a/span")})
List<WebElement> SortFilterItemText;

public boolean SortFilterItemCount() {
	return SortFilterItemText.size()==1;}

	  public Pomsortingandfilteration() {
		PageFactory.initElements(driver, this); }
	public int productcount() { return itemelements.size();}	
public boolean DisplayCustomerReviewFilter() {
	wait.until(ExpectedConditions.visibilityOf(CustomerReview));
	return CustomerReview.isDisplayed();
   

}
public void ClickSortOption() {
	wait.until(ExpectedConditions.elementToBeClickable(SortOption));
	SortOption.click();
}
public boolean DisplaySortOptions() {
	wait.until(ExpectedConditions.visibilityOf(SortOptionsBox));
	return SortOptionsBox.isDisplayed();
}

public void ClickHighToLow() {
	wait.until(ExpectedConditions.elementToBeClickable(PriceHighToLowOption));
	PriceHighToLowOption.click();
}
public boolean DisplayResultSort() {
	wait.until(ExpectedConditions.visibilityOf(ResultsSort));
	return ResultsSort.isDisplayed();
}
public void ClickFilterFreeShip() {
	wait.until(ExpectedConditions.elementToBeClickable(FilterFreeShip));
	FilterFreeShip.click();
}
public boolean DisplayFilterSort() {
	wait.until(ExpectedConditions.visibilityOf(FilterSortResult));
	return FilterSortResult.isDisplayed();
}
}
