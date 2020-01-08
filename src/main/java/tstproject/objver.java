package tstproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objver extends baseclass {
	
	@FindBy(xpath="//li//a[@title]")
	private WebElement Womentitle;
	
	@FindBy(xpath="(//li//a[@title='Dresses'])[2]")
	private WebElement Dresstitle;
	 
	@FindBy(xpath="(//li//a[@title='T-shirts'])[2]")
	private WebElement Tshirtitle;
	
	
	public objver() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomentitle() {
		return Womentitle;
	}
	
	public WebElement getDresstitle() {
		return Dresstitle;
	}
	public WebElement getTshirtitle() {
		return Tshirtitle;
	}
	
	public void clickwomen() {
		Womentitle.click();
	}
	public void clickdress() {
		Dresstitle.click();
	}
	public void clickshirt() {
		Tshirtitle.click();
	}

}
