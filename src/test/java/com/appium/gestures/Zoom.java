package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Zoom 
{

	public AndroidDriver driver;
	@Test
	public void zoominandOut() throws Throwable 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("UDID", "d6c768cf9804");
		cap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		cap.setCapability("appActivity", ".MainActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver =  new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Basic features']").click();

		MobileElement image =	(MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='com.davemorrissey.labs.subscaleview.sample:id/imageView']");

		//driver.zoom(image);
		
		int x= (int) (driver.manage().window().getSize().getWidth()*0.75);
		int y= (int) (driver.manage().window().getSize().getHeight()*0.40);
		driver.zoom(x, y);
		
		Thread.sleep(2000);
		
		//scrnshot
		
		//driver.pinch(image);













	}
}