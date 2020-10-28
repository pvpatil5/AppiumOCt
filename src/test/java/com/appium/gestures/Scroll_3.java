package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Scroll_3 
{
	AndroidDriver driver;
	@Test
	public void tapandScroll() throws  Throwable
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.mrvoonik.android");
		cap.setCapability("appActivity", ".splashsection.Splash");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver =  new AndroidDriver(url,cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement	drawer = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Drawer Open']");

		driver.tap(1, drawer, 500);

		Thread.sleep(1000);

		scrolling("text", "Refund Policy");

		MobileElement element =(MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Refund Policy']");

		//driver.tap(1, element, 100);

		TouchAction ta = new TouchAction(driver);
		//	ta.press(element).release().perform();

		ta.longPress(element, 500).release().perform();

	}
	public void scrolling(String an , String av) 
	{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	}



}
