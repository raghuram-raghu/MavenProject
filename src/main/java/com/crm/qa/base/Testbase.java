package com.crm.qa.base;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.commutility.Testutility;

public class Testbase {
	
	  public static WebDriver driver;
	 
	  public  static Properties prop;
	
	public Testbase() throws FileNotFoundException{
		try {
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("D:\\maven\\src\\main\\java\\com\\cr\\"
				+ "qa\\config\\config.properties ");
		
			prop.load(fis);
		} catch (IOException e) {
				e.printStackTrace();
				e.printStackTrace();
		}
	}
		
		public static void initialization() {
			
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
		//System.setProperty("webdriver.chrome.driver","‪D:\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutility.page_load_timeout,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutility.implicity_wait,TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		}
				
		

}
