package com.group4.ictak.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	//Page Factory
	@FindBy(id="user-name") private WebElement userName;
	@FindBy(id="password") private WebElement passWord;
	@FindBy(id="login-button") private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String str_usrname)
	{
		userName.sendKeys(str_usrname);
	}
	
	public void setPassword(String str_pswrd)
	{
		passWord.sendKeys(str_pswrd);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}

}
