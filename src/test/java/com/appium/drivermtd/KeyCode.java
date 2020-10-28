package com.appium.drivermtd;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class KeyCode 
{
	@Test
	public void keycode() throws Throwable 
	{DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Redmi");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "7.0");
	cap.setCapability("UDID", "d6c768cf9804");
	//cap.setCapability("appPackage", "com.android.camera");
	//cap.setCapability("appActivity", ".Camera");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", "ApiDemos");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//click on Deny
	//driver.findElementByXPath("//android.widget.Button[@text='DENY']").click();
	
	Thread.sleep(2000);
	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	Thread.sleep(2000);
	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	
	
	
	

	}
}
