package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LOcators 
{@Test
	public void locators() throws Throwable 
{

	DesiredCapabilities dc = new DesiredCapabilities();

	dc.setCapability("deviceName", "Redmi");
	dc.setCapability("automationName", "Appium");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "7.0");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");

	URL url = new URL("http://localhost:4723/wd/hub");

	AndroidDriver driver = new AndroidDriver(url, dc);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//	driver.findElementByAccessibilityId("Views").click();

//	driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();;
//
	


}
}