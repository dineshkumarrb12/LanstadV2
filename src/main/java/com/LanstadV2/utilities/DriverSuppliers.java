package com.LanstadV2.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSuppliers {
	WebDriver driver=null;
public WebDriver getdriver(String browser)
{

	String path=null;
	System.out.println("Given browser:- "+browser);
	path=System.getProperty("user.dir");
	System.out.println("path of browsers"+path);
	try{
	if(browser.equalsIgnoreCase("chrome"))
	{
		path=path+"/Source/chromedriver.exe";
		System.out.println("chrome driver path after set: "+path);
		System.setProperty("webdriver.chrome.driver", path);

		this.driver=new ChromeDriver();
		}

	else if(browser.equalsIgnoreCase("firefox"))
	{
		path=path+"/Source/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		this.driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("internet explorer"))
	{
		path=path+"/Source/IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		this.driver=new InternetExplorerDriver();
	}
	}
		catch(Exception e)
		{
			System.out.println("Invalid browser");
		}
	return driver;
}
public void website()
{
	driver.get("https://stglanstad.com/login");
}
}
