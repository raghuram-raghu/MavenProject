package com.crm.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;

public class LoginPageTest extends Testbase {
	LoginPage loginpage;
	HomePage homepage;
	SignupPage signuppage;
	
	public LoginPageTest() throws FileNotFoundException {
		super();
		}

	
	
	@BeforeMethod
	public void setup() throws FileNotFoundException {
		initialization();
		loginpage=new LoginPage();
		
	}
	
	@Test(priority=2)
	public void LoginPageTitleTest() {
		String title=loginpage.validateloginpagetitle();		
	}
	@Test(priority=1)
	public void logodisplyed() {
		boolean logopage =loginpage.logopage();
		Assert.assertTrue(true,"is displayed"); 
	}	
	@Test(priority=3)
	public void logintest() throws FileNotFoundException {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=4)
	public void signuppagetest() throws FileNotFoundException {
		signuppage=loginpage.signpage();
	}
		
		
	@AfterMethod
	public void teardown()  {
		driver.quit();
	}
	
	
}
