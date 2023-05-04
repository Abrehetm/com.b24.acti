package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name: EnterPage
 * Description: manages the locators  and methods of enter page
 * Developed By: Abrehet
 * Reviewed By: Shantosh
 * Date reviewed : 05-01-2023
 */

public class EnterPage extends DriverScript{
	
	//***************************page Locators***************************//
	
		@FindBy(id = "logoutLink") WebElement logoutLink;
		@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement userLoggedText;
		@FindBy(xpath = "//div[@id='container_tasks']") WebElement menuTask;
		@FindBy(xpath = "//div[@id='container_reports']") WebElement menuReports;
		@FindBy(xpath = "//div[@id='container_users']") WebElement menuUsers;
	//***************************page Initialization********************//
		
		public EnterPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
	//***************************page Methods**************************//
		
		public void clickLogout()
		{
			logoutLink.click();
		}
		
		public String getUserLoggedIn()
		{
			return  userLoggedText.getText();
		}
		
		public void clickTaskMenu()
		{
			menuTask.click();	
		}
			
		
			
		

}
