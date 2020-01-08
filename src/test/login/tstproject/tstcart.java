package tstproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class tstcart {
	cart ct;
	baseclass bp;
	public tstcart() {
		ct=new cart();
		bp=new baseclass();
	}
	@Test
	public void verifytab() {
		Assert.assertTrue(ct.getWomentitle().isDisplayed());
		 ct.clickwomen();
		  Assert.assertTrue(ct.getTitlte().contains("Women"));



}}
