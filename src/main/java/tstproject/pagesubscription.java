package tstproject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagesubscription extends baseclass{
	
@FindBy(xpath="//div//input[@name='email']")
private WebElement email;
@FindBy(xpath="//div//button[@class='btn btn-default button button-small']")
private WebElement click;

public pagesubscription() {
	PageFactory.initElements(driver, this);
}
public WebElement mail() {
	email.sendKeys("elakkiyaece1346@gmail.com");
	return email;
}
public WebElement clk() {
	click.click();
	return click;
}
}
