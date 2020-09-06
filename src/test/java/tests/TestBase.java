package tests;

import org.openqa.selenium.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TestBase {

	public static AndroidDriver<AndroidElement> driver;
	public static DesiredCapabilities capabilities;
	
	public static String appPath = System.getProperty("user.dir") + "\\AUT\\com.olxmena.horizontal_2020-08-16.apk";
	
	/*Method To run only one time before the suite to do the follwing:
	 * 1 - Determine the browser used 
	 * 2 - Initialize the driver reference to the correct object and specify the location for the local driver
	 * 		that the code will interact with
	 * 3 - maximizing the window 
	 * 4 - setting implicit wait so that the browser must wait specific amount of time 
	 * 		before announcing failure*/
	@BeforeSuite
	public void startDriver() throws MalformedURLException {
		

		capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("app", appPath);

		
		driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
	} 
	
	
	@AfterSuite
	public void stopDriver() 
	{
		//driver.quit();
	}
}
