package com.appium.gestures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragDrop 
{

	public void dragndrop() throws Throwable 
	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url,cap);

		WebElement element=	driver.findElementByAccessibilityId("Views");

		element.click();

		driver.findElementByAccessibilityId("Drag and Drop").click();

		WebElement src =	driver.findElementById("io.appium.android.apis:id/drag_dot_1");

		WebElement dest=	driver.findElementById("io.appium.android.apis:id/drag_dot_3");

		TouchAction ta = new TouchAction(driver);
		
		ta.longPress(src).waitAction(3000).moveTo(dest).release().perform();

	}

}
