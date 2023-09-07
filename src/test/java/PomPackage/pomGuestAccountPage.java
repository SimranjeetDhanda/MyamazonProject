package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasePackage.Baseclass;

public class pomGuestAccountPage extends Baseclass{
//object repository
	// search box
@FindBy(id="twotabsearchtextbox")
WebElement SearchBox;
// search button
@FindBy(id="nav-search-submit-button")
WebElement SearchBtn;
// search results
@FindBy(id="search")
WebElement SearchResult;
// select prodct
@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")
WebElement SelectProduct;
// buy now button
@FindBy(id="buy-now-button")
WebElement BuyNowBtn;
// page that should not be displayed
@FindBy(id="authportal-main-section")
WebElement SignInPage;
public pomGuestAccountPage() {
PageFactory.initElements(driver, this);}

public void TypeinSearchBox() {
	wait.until(ExpectedConditions.visibilityOf(SearchBox));
	SearchBox.sendKeys("laptop bag");
}
public void clickSearchBtn() {
	wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
	SearchBtn.click();
}

public boolean DisplaySearchResult() {
	wait.until(ExpectedConditions.visibilityOf(SearchResult));
	return SearchResult.isDisplayed();
}
public void selectproduct() {
	wait.until(ExpectedConditions.elementToBeClickable(SelectProduct));
	SelectProduct.click();
}
public void clickBuyNowBtn() {
	wait.until(ExpectedConditions.elementToBeClickable(BuyNowBtn));
	BuyNowBtn.click();
}
public boolean signInpgeDiplayed() {
	wait.until(ExpectedConditions.visibilityOf(SignInPage));
	return SignInPage.isDisplayed();
}
	
}
