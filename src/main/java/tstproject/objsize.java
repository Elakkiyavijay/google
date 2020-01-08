package tstproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objsize extends baseclass {
	@FindBy(xpath="//label[@for='layered_id_attribute_group_1']//a")
	private WebElement Ssize;
	@FindBy(xpath="//label[@for='layered_id_attribute_group_2']//a")
	private WebElement Lsize;
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']//a")
	private WebElement Msize;
	

public objsize() {
	PageFactory.initElements(driver, this);
}
public WebElement getStitle() {
	return Ssize;
}
public WebElement getLtitle() {
	return Lsize;
}
public WebElement getMtitle() {
	return Msize;
}



}