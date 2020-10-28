package com.appium.gestures;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragNDrop 
{
	public static void main(String[] args) throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.mobeta.android.demodslv");
		cap.setCapability("appActivity", ".Launcher");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Basic usage playground']").click();

		MobileElement src = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.mobeta.android.demodslv:id/drag_handle']");
		MobileElement dest = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Herbie Hancock']");

		Thread.sleep(2000);

		TouchAction ta = new TouchAction(driver);
		ta.longPress(src).waitAction(3000).moveTo(dest).release().perform();	
	
	}
}
