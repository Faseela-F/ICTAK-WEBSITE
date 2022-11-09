package com.group4.ictak.website.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.group4.ictak.website.constants.AutomationConstants;
import com.group4.ictak.website.pages.LoginPage;
import com.group4.ictak.website.utilities.ExcelUtility1;

public class Test_Login extends TestBase {
	LoginPage objLogin;
	
	@Test
	public void verifyLogin() throws IOException {
		objLogin=new LoginPage(driver);
		
		String username=ExcelUtility1.getCellData(0, 0);
		String password=ExcelUtility1.getCellData(0, 1);
		
		objLogin.setUsername(username);
		objLogin.setPassword(password);
		objLogin.clickLogin();
		
		String expectedTilte=AutomationConstants.HOMEPAGETITLE;
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTilte, actualTitle);
		
	}

}
