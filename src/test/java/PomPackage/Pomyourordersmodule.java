package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasePackage.Baseclass;

public class Pomyourordersmodule extends Baseclass {
// object repository
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
	WebElement YourOrdersTab;
	@FindBy(css="#a-page > section > div > div.a-row.a-spacing-medium > div:nth-child(1) > h1")
	WebElement YourOrderTittle;
	@FindBy(css="#a-autoid-1-announce > span")
	WebElement PastOrdersTab;
	@FindBy(css="#a-popover-1 > div > div")
	WebElement PastOrders;
	@FindBy(linkText="Buy Again")
	WebElement BuyAgainOption;
	@FindBy(css="#CardInstance6_V-nde3-muTZftFrLhLIg > div > div:nth-child(3) > ul > li._buy-again-tabs-desktop_searchAndYoStyle_tab-list-item__24Jay._buy-again-tabs-desktop_searchAndYoStyle_selected__3kNYk > span")
	WebElement BuyAgainHeader;
	@FindBy(linkText="Not Yet Shipped")
	WebElement NotYetShipped;
	@FindBy(css="#ordersContainer > div.a-row.a-spacing-extra-large.a-spacing-top-large > div > a")
		    WebElement NoOrderMessage;
	@FindBy(linkText="Cancelled Orders")
	WebElement CancelledOrders;
	@FindBy(css="#ordersContainer > div.a-row.a-spacing-extra-large.a-spacing-top-large > div")
	WebElement CancelledOrderMessage;
	public Pomyourordersmodule() {
		PageFactory.initElements(driver, this);
	}
public void ClickYourOrderTab() {
		YourOrdersTab.click();
	}
public boolean YourOrderTittleDisplay() {
	wait.until(ExpectedConditions.visibilityOf(YourOrderTittle));
	return YourOrderTittle.isDisplayed();
}
public void ClickPastOrdersTab() {
	PastOrdersTab.click();
}
public boolean isPastOrdersDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(PastOrders));
	return PastOrders.isDisplayed();
}
public void ClickBuyAgain() {
	BuyAgainOption.click();
}
public boolean BuyAgainHeader() {
	wait.until(ExpectedConditions.visibilityOf(BuyAgainOption));
	return BuyAgainOption.isDisplayed();
}
public void ClickNotYetShipped() {
	NotYetShipped.click();
}
public boolean NoOrderMessageDisplay() {
	wait.until(ExpectedConditions.visibilityOf(NoOrderMessage));
	return NoOrderMessage.isDisplayed();
}
public void ClickCancelledOrders() {
	CancelledOrders.click();
}
public boolean DisplaySixMonthOrders() {
	wait.until(ExpectedConditions.visibilityOf(CancelledOrderMessage));
	return CancelledOrderMessage.isDisplayed();
}



}
