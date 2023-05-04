package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest{
	
	@Test(priority = 1, enabled = true)
	public void testCreateCustomer() {
		lp.enterusername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getUserLoggedIn();
		Assert.assertTrue(actual.contains("John"));
		ep.clickTaskMenu();
		tp.clickAddNewButton();
		tp.clicknewCustomerOption();
		tp.entercustomerName("TestCustomer");
		tp.enterCustomerDescription(" Just a Dummy Customer Created by Automation");
		tp.clickCreateCustomer();
		String msg = tp.getSuccessMsg();
		Assert.assertTrue(msg.contains("has been created"));
		ep.clickLogout();
		
	}@Test(priority = 2, enabled = true)
	public void testDeleteCustomer() 
	{
		lp.enterusername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.getUserLoggedIn();
		Assert.assertTrue(actual.contains("John Doe"));
		ep.clickTaskMenu();
		tp.searchCreatedCustomer("TestCustomer");
		tp.clickSearchedCustomer();
		tp.clickEditButton();
		tp.clickAction();
		tp.clickDelete();
		tp.clickDeletePermanently();
		String msg = tp.getSuccessMsg();
		Assert.assertTrue(msg.contains("has been deleted"));
		ep.clickLogout();
		
	}
	

}
