package com.LanstadV2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
public WebDriver driver=null;
public WebDriverWait wait;

@FindBy(id="username")
private WebElement txtusername;
@FindBy(id="password")
private WebElement txtpassword;
@FindBy(css="button[type='submit']")
private WebElement btnsignin;
@FindBy(id="errorMsg")
private WebElement msgmandatory;
@FindBy(css="div.form.rounded.bg-white.border.shadow")
private WebElement pglogin;


public LoginPage(WebDriver driver)
{
	this.driver=driver;
	this.wait=new WebDriverWait(driver,60);
}

public void login(String username,String password)
{
	//wait.until(ExpectedConditions.visibilityOf(pglogin));
	
	txtusername.sendKeys(username);
	txtpassword.sendKeys(password);
	btnsignin.click();
}
}
