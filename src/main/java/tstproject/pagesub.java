package tstproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagesub extends baseclass{
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement verify;
	

	public pagesub() {
		PageFactory.initElements(driver, this);
	}
	public WebElement vrfy() {
		return verify;
	}
	


}
