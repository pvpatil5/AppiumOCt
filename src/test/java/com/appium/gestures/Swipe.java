package com.appium.gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Swipe
{
	public AndroidDriver driver;
	public void swipe1() throws Throwable 
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




		Dimension d = driver.manage().window().getSize();
		int ht= d.getHeight();
		System.out.println("height="+ht);
		int wd=	d.getWidth();
		System.out.println("width="+wd);

		//swipe horizontal
		//		int startx = (int) (wd*.20);//20
		//
		//		int starty = (int) (ht*.50);//100
		//
		//		int endx = (int) (wd*.80);
		//
		//		int endy = (int) (ht*.50);
		//		driver.swipe(startx, starty, endx, endy, 500);


		// swipe vertically

		//		int startx = (int) (wd*.50);
		//		int starty =(int) (ht*.30);
		//		int endx = (int)(wd*.50);
		//		int endy= (int)(ht*.80);
		//	
		//		driver.swipe(startx, starty, endx, endy, 500);


		//Swipe L pattern

		int x1 = (int) (wd*.10);
		int y1 =(int)(ht*.20);
		int y2 =(int)(ht*.80);
		
		swipe(x1, y1, x1, y2);
		
		Thread.sleep(1000);
		
		int endx = (int) (wd*.80);

		swipe(x1, y2, endx, y2);
	}
	
	public void swipe(int startx,int starty , int endx , int endy) 
	{
		driver.swipe(startx, starty, endx, endy, 500);
	}
	
	
	
}