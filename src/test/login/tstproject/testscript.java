package tstproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testscript {
	objver hp;
	baseclass bp;

	
	public testscript() {
		hp=new objver();
		bp=new baseclass();
		
		}
	@Test
	public void verifytab() {
		Assert.assertTrue(hp.getWomentitle().isDisplayed());
		Assert.assertTrue(hp.getDresstitle().isDisplayed());
		Assert.assertTrue(hp.getTshirtitle().isDisplayed());
	}
	
  @Test
    public void verifyclick() {
	  hp.clickwomen();
	  Assert.assertTrue(hp.getTitlte().contains("Women"));
	  hp.clickdress();
	  Assert.assertTrue(hp.getTitlte().contains("Dresses"));
	  hp.clickshirt();
	  Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
  }
  
  
  
  
  
  
  
    }