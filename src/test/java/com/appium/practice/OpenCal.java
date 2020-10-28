package com.appium.practice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenCal 
{
	@Test
	public void OpenCalculator() throws Throwable 
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("platformVersion", "7.0");
		
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
	}

}
