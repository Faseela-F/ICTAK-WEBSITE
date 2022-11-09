package com.group4.ictak.website.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	//Page Factory
	@FindBy(id="dropdownMenuBlocks") private WebElement Courses;
	
}
