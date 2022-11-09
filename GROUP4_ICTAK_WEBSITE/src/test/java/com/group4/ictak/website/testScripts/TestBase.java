package com.group4.ictak.website.testScripts;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop = null;
	String driverPath1;
	String driverPath2;
	
	public static void TestConfig() {
			
			prop=new Properties();
		
			FileInputStream ip;
			try {
				ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/" + "config.properties");
				
				prop.load(ip);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
				
		
	}
	
	@BeforeTest
	public void onSetup() throws FileNotFoundException{
			
		TestConfig();
		
		String browserName = prop.getProperty("browser");
		driverPath1 = System.getProperty("user.dir")+"/drivers/chromedriver.exe";
		driverPath2 = System.getProperty("user.dir")+"/drivers/geckodriver.exe";
		
		if (browserName.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", driverPath1);
			driver = new ChromeDriver();
					}
		
		else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", driverPath2);
		driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void quitBrowser() throws Exception {
		Thread.sleep(10000);
		if(driver!=null) {
			driver.quit();
		}
	}

}