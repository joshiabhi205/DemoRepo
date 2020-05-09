package com.MasterPage.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	
	
	public WebDriver driver;
	
	//Code to intialize the webdriver
	public BaseClass() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fp = new FileInputStream("C:\\Users\\ToRnAdO\\eclipse-workspace\\ElevenDaysChallange\\configuration.properties");
		prop.load(fp);
		String browsername=prop.getProperty("browsername");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ToRnAdO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		if(browsername.equals("chrome"))
		{
			System.out.println("chrome");
           driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           
		 
		}
		else if (browsername=="IE")
		{
			driver.get("");
		}
		else if (browsername=="mozilla")
		{
			driver.get("");
		}
	
		
	}
	
	
		
		
		
		
		
	

	}


