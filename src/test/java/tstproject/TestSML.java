package tstproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSML {
	objver hp;
	baseclass bp;
	objsize op;
	
	public TestSML() {
		hp=new objver();
		bp=new baseclass();
		op=new objsize();
		}
	@Test
	  public void verifysize() {
		  hp.clickdress();
		  Assert.assertTrue(op.getStitle().isDisplayed());
		  Assert.assertTrue(op.getLtitle().isDisplayed());
		  Assert.assertTrue(op.getMtitle().isDisplayed());
		  
	  }
}
