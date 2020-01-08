package tstproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart extends baseclass {
	@FindBy(xpath="//li//a[@title]")
	private WebElement Womentitle;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement Faded;
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement atc;
	
	public cart() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomentitle() {
		return Womentitle;
	}
	public void clickwomen() {
		Womentitle.click();
	}
	public void faded() {
	Actions act=new Actions(driver);
    act.moveToElement(Faded).perform();
    	}
	public void atc() {
		Actions ac=new Actions(driver);
	    ac.moveToElement(atc).perform();
	//    atc.click();
	  }
}
