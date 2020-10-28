package com.appium.practice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch_Voonik 
{
	@Test
	public void openVoonik() throws Throwable 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("platformVersion", "7.0");
		dc.setCapability("UDID", "d6c768cf9804");
		dc.setCapability("appPackage", "");
		dc.setCapability("appActivity", "");
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
	}
	
	
}
