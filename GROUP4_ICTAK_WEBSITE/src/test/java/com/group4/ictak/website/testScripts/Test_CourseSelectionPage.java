package com.group4.ictak.website.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.group4.ictak.website.constants.AutomationConstants;
import com.group4.ictak.website.pages.CourseSelectionPage;
import com.group4.ictak.website.utilities.ExcelUtility;

public class Test_CourseSelectionPage extends TestBase {

	CourseSelectionPage objCourseSelection;
	
	@Test
	public void courseSelection() throws InterruptedException, IOException
	{
		objCourseSelection=new CourseSelectionPage(driver);
		String StudentName=ExcelUtility.getCellData(0, 0);
		String StudentEmail=ExcelUtility.getCellData(0, 1);
		String StudentPhoneNo=ExcelUtility.getCellData(0, 2);
		
		objCourseSelection.clickCourses();
		Thread.sleep(1000);
		objCourseSelection.selectCourses();
		Thread.sleep(1000);
		objCourseSelection.clickApplyNow();
		Thread.sleep(1000);
		objCourseSelection.setstudName(StudentName);
		Thread.sleep(1000);
		objCourseSelection.setstudEmail(StudentEmail);
		Thread.sleep(1000);
		objCourseSelection.setstudPhoneNo(StudentPhoneNo);
		Thread.sleep(1000);
		objCourseSelection.clickRegisterButton();
		
		String expected_RegAck=AutomationConstants.REGISTRATIONACK;
		String actual_RegAck=driver.switchTo().alert().getText();
		Assert.assertEquals(expected_RegAck, actual_RegAck);
	}
	
}
