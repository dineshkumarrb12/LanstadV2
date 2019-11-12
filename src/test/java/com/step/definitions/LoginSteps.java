package com.step.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.LanstadV2.pom.LoginPage;
import com.LanstadV2.utilities.DriverSuppliers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {
public WebDriver driver=null;

//this function is called as glue code or step definition
@Given("Launch the application")
public void LaunthApplication()
{
	DriverSuppliers d=new DriverSuppliers();
	this.driver=d.getdriver("chrome");
	d.website();
}
@When("sign in with username as {string} and password as {string}")
public void Login(String username,String password)
{
	LoginPage log = PageFactory.initElements(driver, LoginPage.class);
	System.out.println("username fetched "+username+"password "+password);
	log.login(username, password);
}

}
