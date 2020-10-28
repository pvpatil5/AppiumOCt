package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Multi_touch_Scrnshot 
{
	public AndroidDriver driver;
	@Test
	public void multiTouch() throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		cap.setCapability("appActivity", ".TouchScreenTestActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver =  new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int x = driver.manage().window().getSize().getWidth()/2;

		int y =	driver.manage().window().getSize().getHeight()/2;	

		TouchAction finger1 = new TouchAction(driver);
		finger1.press(x-50, y-100).moveTo(x-50, y+100);

		TouchAction finger2 = new TouchAction(driver);
		finger2.press(x, y-100).moveTo(x, y+100);

		TouchAction finger3 = new TouchAction(driver);
		finger2.press(x+50, y-100).moveTo(x+50, y+100);


		MultiTouchAction mta = new MultiTouchAction(driver);
		mta.add(finger1).add(finger2).add(finger3).perform();

	}
}
