package PomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import BasePackage.Baseclass;

public class pomShoppingcartpage extends Baseclass{
	//object repository
		// search box
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	// search button
	@FindBy(id="nav-search-submit-button")
	WebElement SearchBtn;
	// select product
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[3]/div[1]/h2/a/span")
	WebElement SelectProduct;
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[3]/div[1]/h2/a/span")
  WebElement SelectProduct2;
	@FindBy(css="#sw-atc-details-single-container > div.a-section.a-padding-medium.sw-atc-message-section")
   WebElement Itemfeature;
   @FindBy(css="#attachSiNoCoverage > span > input")
   WebElement noProtection;
   @FindBy(id="sw-gtc")
   WebElement GoToCart;
   @FindBy(id="a-autoid-1-announce")
   WebElement Quantity;
   @FindBy(id="quantity_2")
   WebElement Enterquantities;
   @FindBy(id="quantity_0")
		   WebElement removeItem;
   @FindBy(id="sc-subtotal-label-activecart")
   WebElement updatedquantity;
   @FindBy(css="#sc-subtotal-amount-activecart > span")
   WebElement totalamount;
   @FindBy(id="sc-active-cart")
   WebElement ItemsFeature;
    @FindBy(id="sc-active-cart")
     WebElement remainingItems;
   @FindBy(css="#a-autoid-4-announce") 
   WebElement QuantityForOtheritem;
   @FindBy(css="#sc-active-ff83f45f-abf7-4136-be7d-6a78fcbbed4f > div > div:nth-child(1)")
  WebElement RemovalmsgOfOneItem;
   @FindBy(css="#sc-active-5adecd09-db5b-4f50-9451-d7ab58dc5146 > div.sc-list-item-content > div > div:nth-child(2) > div.a-row.sc-action-links > span.a-size-small.sc-action-delete > span > input")
   WebElement removeSecondItem;
   @FindBy(css="#sc-active-cart > div > div > div > h1")
   WebElement EmptyCartMsg;
   @FindBy(id="productTitle")
   WebElement Moreinfo;
   @FindBy(xpath="//*[@id=\"nav-cart-count-container\"]/span[2]")
 WebElement Cart;
   @FindBy(xpath="//*[@id=\"sc-active-a75b8711-8699-4345-8574-c306c94254d0\"]/div[4]")
   WebElement ProductInCart;

 @FindBy(xpath="//*[@id=\"sc-active-226ac987-0cbc-4f75-b2bf-ce34c22a8f4a\"]/div[4]/div/div[2]/div[1]/span[2]/span/input")
 WebElement RemoveSecondProduct;
 Actions action=new Actions(driver);
 public void RemoveSecondProduct() {
	action.scrollToElement(RemoveSecondProduct);
	/* wait.until(ExpectedConditions.visibilityOf(RemoveSecondProduct)); */
		/* wait.until(ExpectedConditions.elementToBeClickable(RemoveSecondProduct)); */
	   RemoveSecondProduct.click();
   }
   
   public pomShoppingcartpage() {
	   PageFactory.initElements(driver, this);}
   public void ClickSecondProduct() {
	 
	   wait.until(ExpectedConditions.visibilityOf(SelectProduct2));
	   SelectProduct2.click();
   }
 
public void TypeinSearchBox() {
	wait.until(ExpectedConditions.elementToBeClickable(SearchBox));
	SearchBox.sendKeys("laptop bag");
}
public void Typesecondproduct() {
	wait.until(ExpectedConditions.elementToBeClickable(SearchBox));
	SearchBox.sendKeys("Pencil");
}
public void clickSearchBtn() {
	wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
	SearchBtn.click();
	}
public void selectproduct() {
	 wait.until(ExpectedConditions.elementToBeClickable(SelectProduct)); 
	SelectProduct.click();

}

public void addToCart() {
	addToCart.click();

}
public boolean itemFeatureDisplay() {
	wait.until(ExpectedConditions.visibilityOf(Itemfeature));
	return Itemfeature.isDisplayed();
}

public void clickNoProtection() {
	wait.until(ExpectedConditions.visibilityOf(noProtection));
	noProtection.click();
}
public void ClickGoToCart() {
	wait.until(ExpectedConditions.visibilityOf(GoToCart));
	GoToCart.click();
}
public void clickquantity() {
	Quantity.click();
}
public void enterQuantities() {
	Enterquantities.click();
	}
public boolean displayupdatedQty() {
	return updatedquantity.isDisplayed();
}
public boolean totalamount() {
	return totalamount.isDisplayed();
}
public boolean featuresofItems() {
	return ItemsFeature.isDisplayed();
}
public void RemoveItem() {
	removeItem.click();
}
public boolean DisplayRemaningItems() {
	return remainingItems.isDisplayed();
}
public void QuantityForSecondItem() {
	 wait.until(ExpectedConditions.elementToBeClickable(QuantityForOtheritem));
QuantityForOtheritem.click();
   }
public void Removeall() {
	
	wait.until(ExpectedConditions.elementToBeClickable(removeSecondItem)); 
	removeSecondItem.click();}
public boolean EMptyCart() {
	wait.until(ExpectedConditions.visibilityOf(EmptyCartMsg));
	return EmptyCartMsg.isDisplayed();
}
public boolean productinfo() {
	return Moreinfo.isDisplayed();
}
public boolean DisplaycartwithItems() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-cart-count\"]")));
return	Cart.isDisplayed();
}

}

