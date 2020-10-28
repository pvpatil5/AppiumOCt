package com.appium.gestures;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Scroll_
{
	AndroidDriver driver;
	@Test
	public void scroll() throws Throwable
	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");

		 //cap.setCapability("noReset", false);// App starting from zero
		cap.setCapability("noReset", true); // App will start as it is available in phone

		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);


		Thread.sleep(3000); 
		WebElement element=driver.findElementByAccessibilityId("Views");

		driver.tap(1, element, 500);

		Thread.sleep(2000); 

		scrolling("index", "7");
		
		WebElement element1= driver.findElementByXPath("//android.widget.TextView[@content-desc='Layouts']");
		
		driver.tap(1, element1, 500);
		
		
	}
	public void scrolling(String an , String av) 
	{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	}
	
}
