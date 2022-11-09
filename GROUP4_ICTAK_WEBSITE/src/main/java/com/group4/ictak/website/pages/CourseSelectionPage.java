package com.group4.ictak.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseSelectionPage {

	 WebDriver driver;
	 
	 //Page Factory
	 
	 @FindBy(id="dropdownMenuBlocks")
	 private WebElement CourseList;
	 
	 @FindBy(xpath="//a[@href='/LandingPage/singlecourses/61dc255f3b4aa2295f884131']")
	 private WebElement courseMeanStack;
	 
	 @FindBy(xpath="//button[contains(@class,'btn bg-gradient-success w-auto me-2 ng-star-inserted')]")
	 private WebElement applyNow;
	 
	// @FindBy(path="//input[contains(@name,'name']")
	 @FindBy(xpath="//input[@placeholder='Name']")
	 private WebElement studName;
	 
	 @FindBy(xpath="//input[@placeholder='Email']")
	 private WebElement studEmail;
	 
	 @FindBy(xpath="//input[@placeholder='Number']")
	 private WebElement studPhoneNo;
	 
	 @FindBy(xpath="//button[contains(@class,'btn bg-gradient-primary w-100 mt-4 mb-0')]")
	 private WebElement registerBtton;
	 
	 
	 public CourseSelectionPage(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 }

	 
	 public void clickCourses()
	 {
		 CourseList.click();
	 }
	 
	 public void selectCourses()
	 {
		 courseMeanStack.click();
	 }
	 
	/* public void clickApplyNow()
	 {
		 applyNow.click();
	 }
	 */
	 public void setstudName(String str_studName) throws InterruptedException
		{
		 studName.sendKeys(str_studName);
		}
		
		public void setstudEmail(String str_studEmail) throws InterruptedException
		{
			studEmail.sendKeys(str_studEmail);
			//Thread.sleep(1000);
		}
		
		public void setstudPhoneNo(String str_studPhoneNo) throws InterruptedException
		{
			studPhoneNo.sendKeys(str_studPhoneNo);
			//Thread.sleep(1000);
		}
		
		public void clickRegisterButton()
		{
			registerBtton.click();
		}


		public void clickApplyNow() {
			// TODO Auto-generated method stub
			applyNow.click();
		}
	 
}	 
	

	 
	 

