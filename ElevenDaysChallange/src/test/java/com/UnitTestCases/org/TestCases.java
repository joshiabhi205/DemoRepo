package com.UnitTestCases.org;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.HomePage.org.HomePage;
import com.MasterPage.org.BaseClass;
//import com.ReactPage.org.ReactPage;



public class TestCases extends BaseClass
{

	 public TestCases() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	//public WebDriver driver;
	 @Test(priority=1)
	 public void launchbrowser() throws IOException
	 {
		 HomePage hp = new HomePage();
		 hp.navigatetohomepage();
		 
	 }
	
	
	@Test(priority=2)
	public void getapplist() throws IOException
	{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\ToRnAdO\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        /// driver.get("http://todomvc.com/");
		
		 HomePage hm = new HomePage();
		 hm.navigatetohomepage();
         WebElement element = hm.FindReactElement();
         if(element != null) 
        	 element.click();
         else
        	 System.out.println("Do not perform click operation");
       
         }

	
	
}	
	

