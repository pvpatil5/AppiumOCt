package com.appium.drivermtd;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserStackSample {
	@Test
	public  void browserStack() throws Throwable {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "pavanpatil2");
		caps.setCapability("browserstack.key", "CHAnHaZMHgmzKmpDweBN");

		// Set URL of the application under test
		caps.setCapability("app", "bs://3b92e2f11cd0ea20f9885ec0af806ab3de2f512e");

		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "first_test");
		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "ApiDemos");


		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);


		/* Write your Custom code here */
		WebElement element=driver.findElementByAccessibilityId("Views");

		driver.tap(1, element, 500);


		// Invoke driver.quit() after the test is done to indicate that the test is completed.
		driver.quit();

	}

}


