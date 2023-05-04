package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{
	
	
	
	@Test
	public void testLoginPageTitle()
	{
		
		String expected= "actiTIME - Login";
		String actual = lp.getLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void testActiImgDisplayed()
	{
		
		boolean flag = lp.verifyActiImg();
		Assert.assertTrue(flag);
		
		
	}
	@Test
	public void testForgotPasswordDisplayed() 
	{
		
		boolean flag = lp.verifyForgotpasswordLink();
		Assert.assertTrue(flag);
		quitDriver();
	}
	@Test
	public void testLoginFunction()
	{
		
		lp.enterusername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		
	}
	@Test
	public void testLoginInvaliCredientials() throws InterruptedException
	{
		
		lp.enterPassword("admin");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String errmsg = lp.getErrMsgText();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
		
		
	}

}
