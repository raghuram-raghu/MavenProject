package com.crm.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.Testbase;

public class LoginPage extends Testbase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[2]/a") 
	WebElement signupbtn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
	WebElement crmlogo;
	
	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver,this);
	}
	public String validateloginpagetitle() {
		return driver.getTitle();	
		}
	public boolean logopage() {
		  return crmlogo.isDisplayed();
		  
	}
	public HomePage login(String un,String pwd) throws FileNotFoundException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	return new HomePage(); 
	}
	public SignupPage signpage() throws FileNotFoundException {
		signupbtn.click();
    return new SignupPage();
	}
	
}
