package PomPackage;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.Baseclass;

public class Pomsearchingmodule extends Baseclass{
	 pomShoppingcartpage	shopping=new pomShoppingcartpage();	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/span/div/div/span")
		WebElement SearchResult;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")
	WebElement SearchResult2;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div")
	WebElement SearchedProductFeature;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[69]/div/div/span/a[3]")
	WebElement NextBtn;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[67]/div/div/span/span[1]")
	WebElement SecondPage;
	
 
	@FindBy(xpath="//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div")
	WebElement NumberofproductsText;
	public Pomsearchingmodule() {
		PageFactory.initElements(driver, this);
		
	}
	
	
public void SerachKeyword() {
	shopping.SearchBox.sendKeys("laptop");
}

public  boolean SearchResultDisplayed() {
	return SearchResult.isDisplayed();
}
public void SendKeysDescription() {
	shopping.SearchBox.sendKeys("touch screen laptop");
}

Actions action=new Actions(driver);

public void scrolldown() {
	action.scrollToElement(SearchResult);
}

public void SendKeysPartialText() {
	shopping.SearchBox.sendKeys("samsung galaxy");
}
public void SendKeysForAsin() {
	shopping.SearchBox.sendKeys("B0BWMRFYG5");
}
public void SendKeysForPartialAsin() {
	shopping.SearchBox.sendKeys("B0BW");
}
public boolean SearchResult2Displayed() {
	return SearchResult2.isDisplayed();
}
public void SendKeysCategory() {
	shopping.SearchBox.sendKeys("electronic devices");
}
public boolean ProductImageandFeaturesDisplayed() {
	return SearchedProductFeature.isDisplayed();
}
public void ScrollDownToProdcutInfo() {
	action.scrollToElement(SearchedProductFeature);
}
public void ClickNextBtn() {
	NextBtn.click();
}


public void scrolltoNextBtn() {
	action.scrollToElement(NextBtn);
}
public void scrolltoSecondPage() {
	action.scrollToElement(SecondPage);
}
public String DisplayNumberOfProdcuts() {
	wait.until(ExpectedConditions.visibilityOf(NumberofproductsText));
	return NumberofproductsText.getText();
}
}


