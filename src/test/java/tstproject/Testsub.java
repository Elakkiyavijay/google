package tstproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testsub {
	objver hp;
	pagesubscription ps;
	pagesub pp;
	
	public Testsub() {
		hp=new objver();
		ps=new pagesubscription();
		pp=new pagesub();
		}
	@Test
	  public void verifymsg() {
		ps.mail();
		ps.clk();
		Assert.assertTrue(pp.vrfy().getText().contains("You have successfully subscribed to this newsletter"));
		 
	  }

}
