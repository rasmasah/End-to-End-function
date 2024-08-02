package com.ecom.app.mod1;

import org.testng.annotations.Test;

import app.baseset.BaseClass;

public class AmazonLaunch extends BaseClass{
	@Test(groups= {"SmokeTest"})
	public void aHomepage() {
		System.out.println("open amazon");
		String URL = System.getProperty("aurl","https://www.amazon.in/");
		driver.get(URL);
	}
	
	@Test(groups={"RegressionTest"})
	public void fHomepage() {
		System.out.println("Open Flipkart");
		String URL = System.getProperty("furl","https://www.flipkart.com/");
		driver.get(URL);
	}

}
