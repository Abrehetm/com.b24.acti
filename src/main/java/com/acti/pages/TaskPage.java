package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Helper;

/*
 * Name: TaskPage
 * Description: manages the locators  and methods of task page
 * Developed By: Abrehet
 * Reviewed By: Shantosh
 * Date reviewed : 05-02-2023
 */

public class TaskPage extends DriverScript{
	

		//***************************page Locators***************************//
			@FindBy(xpath = "//div[text()='Add New']") WebElement addNewButton;
			@FindBy(xpath = "//div[@class = 'item createNewCustomer']") WebElement newCustomerOption;
			@FindBy(xpath = "//input[@class = 'inputFieldWithPlaceholder newNameField inputNameField']") WebElement customerNameTb;
			@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTarea;
			@FindBy(xpath = "//div[contains(text(),'Create Customer')]") WebElement createCustomertbutton;
			@FindBy(xpath = "//span[@class = 'innerHtml']") WebElement successMsg;
			@FindBy(xpath = "(//input[@placeholder ='Start typing name ...'])[1]") WebElement textboxStartTyping;
			@FindBy(xpath = "//div[@class='filteredContainer']//div[@class='title']") WebElement searchedCustomer;
			@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
			@FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']") WebElement buttonAction;
			@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']") WebElement buttonDelete;
			@FindBy(xpath = "//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanently;
			
			//***************************page Initialization********************//

			public TaskPage() {
				PageFactory.initElements(driver, this);
			}

			// ***************************page Methods**************************//
			
			public void clickDeletePermanently() {
				buttonDeletePermanently.click();
				Helper.sleep();
			}
			public void clickDelete() {
				buttonDelete.click();
			}
			public void clickAction() {
				buttonAction.click();
				Helper.sleep();
				
			}
			public void clickEditButton() {
				buttonEdit.click();
				Helper.sleep();
			}
			public void clickSearchedCustomer() {
				searchedCustomer.click();
			}
			public void searchCreatedCustomer(String Customername) 
			{
				textboxStartTyping.sendKeys(Customername);
				
			}
			
			public void clickAddNewButton() {
				addNewButton.click();
				
			}
			
			public void clicknewCustomerOption() {
				newCustomerOption.click();
			}
			 public void entercustomerName(String CustomerName) {
				 customerNameTb.sendKeys(CustomerName);
			 }
			 
			 public void enterCustomerDescription(String customerDescriotion) {
				 customerDescriptionTarea.sendKeys(customerDescriotion);
				 
			 }
			 
			 public void clickCreateCustomer() {
				 createCustomertbutton.click(); 
			 }
			 
			 public String getSuccessMsg() {
				 return successMsg.getText();
			 }
	

}
