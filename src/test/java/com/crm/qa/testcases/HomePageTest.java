package com.crm.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.commutility.Testutility;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends Testbase {
	LoginPage loginpage;
	HomePage homepage;
	Testutility testutility;
	

	public HomePageTest() throws FileNotFoundException {
		super();
	}
	@BeforeMethod
	public void setup() throws FileNotFoundException {
		initialization();
		testutility=new Testutility();
		loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
		 
	}
	@Test
	public void veriyfyhomepagetitletest(){
		String homepagetitle=homepage.verifyhomepagetitle() ;
		System.out.println("homepagetitle is"+homepagetitle);
	}
	
	@Test
	public void ValidateContactsPage() throws FileNotFoundException {
		testutility.switchtoframe();
		homepage.ClickOnContactsLink();
	}
	@Test
	public void ValidateDealsPage() throws FileNotFoundException {
		testutility.switchtoframe();
		homepage.ClickOnDealsLink();
	}
	@Test
	public void ValidateTasksPage() throws FileNotFoundException {
		testutility.switchtoframe();
		homepage.ClickOnTasksLink();
	}
	
	@AfterMethod
	public void teardown()  {
		driver.quit();
	}

}
 