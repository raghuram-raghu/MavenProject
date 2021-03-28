package com.crm.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class HomePage  extends Testbase{
	LoginPage loginpage;
	
	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement UsernameHeader;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement  ContactsLink  ;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	public HomePage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver,this);
	}
	public void validateusername() {
		driver.getTitle();
	}
	public ContactsPage ClickOnContactsLink() throws FileNotFoundException {
		ContactsLink.click();
		return new ContactsPage();
	}
	public DealsPage ClickOnDealsLink() throws FileNotFoundException {
		DealsLink.click();
		return new DealsPage();
	}
	public Taskspage ClickOnTasksLink() throws FileNotFoundException {
		TasksLink.click();
		return new Taskspage();
		
		
	}
	public String verifyhomepagetitle() {
		return driver.getTitle();
		
	}

} 
