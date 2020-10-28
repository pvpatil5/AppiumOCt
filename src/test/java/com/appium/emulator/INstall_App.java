package com.appium.emulator;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class INstall_App 
{

	@Test
	public void installApk() throws Throwable 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "Android Emulator");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "emulator-5554");
		
		// to install a given app
		dc.setCapability("app", "D:\\APPIUM_Stuff\\APK\\General-Store.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, dc);

	}
}
