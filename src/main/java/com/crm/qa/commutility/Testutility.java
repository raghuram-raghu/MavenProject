package com.crm.qa.commutility;

import java.io.FileNotFoundException;

import com.crm.qa.base.Testbase;

public class Testutility extends Testbase {
	
	 public Testutility() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long page_load_timeout = 20;
	 
	 public static long implicity_wait = 10;
	 
	 
	 public void switchtoframe() {
		 driver.switchTo().frame("mainpanel");
	 }

}
 