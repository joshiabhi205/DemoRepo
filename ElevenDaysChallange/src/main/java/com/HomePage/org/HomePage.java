package com.HomePage.org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

import com.MasterPage.org.BaseClass;

public class HomePage extends BaseClass
{


	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//xpath for applist
	By applist = By.xpath("//div[@class='js-app-list'][@data-app-list='js']");
	//By title=By.xpath("//h1[text()='todos']");
	
	public void navigatetohomepage() throws IOException
	{       
		
		driver.get("http://todomvc.com");
		  
	}
	
	

	
	//function to load all the applist link and if the applist is React it will return the webelement
	public WebElement FindReactElement() throws IOException
	{
		
		
		List<WebElement> elementsList = driver.findElements(applist);
	
		 
		
		for(WebElement element : elementsList)
		{System.out.println(element.getText());
		    if(element.getText().contains("React"))
		    {
		    	System.out.println(element.getText());
			    return driver.findElement(By.linkText("React"));
		    }
		}
		return null;
		
	}
	




       

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	public WebElement ClickReactWebElement()
	{
		
		return driver.findElement(applist);
		
	}
*/		
	
	/*
	List<WebElement> list=driver.findElements(applist);
	list.size();			
	for(int i=0;i<=list.size();i++)
	{
		
  return list.get(i).getText().equalsIgnoreCase("React");
	*/	  
		
		
		
		
		
	}


	

	

