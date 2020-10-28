package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Tap_1 
{

	public AndroidDriver driver;
	@Test
	public void tap() throws  Throwable
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "");
		cap.setCapability("appActivity", "");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver =  new AndroidDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement	drawer = driver.findElementByXPath("");

		taponElement(drawer);
		
	}
	
	public void taponElement(WebElement element) 
	{
		driver.tap(1, element, 500);
	}
}
