package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;


public class PageBase {
	//wait for maximum 30 seconds before any operation
	WebDriverWait wait;


	public PageBase(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}

	

	protected void inputStringToElement(AndroidDriver loc_driver, String locator, String textToBeEntered) {
		AndroidElement mobileElement = (AndroidElement) loc_driver.findElement(By.xpath(locator));
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
		mobileElement.sendKeys(textToBeEntered);
	}

	protected void clickElement(AndroidDriver loc_driver, String locator, String strategy) {
		AndroidElement mobileElement = null;
		
		if(strategy == "xpath") {
			mobileElement = (AndroidElement) loc_driver.findElement(By.xpath(locator));
		}else if (strategy == "class") {
			mobileElement = (AndroidElement) loc_driver.findElement(By.className(locator));
		}
		mobileElement.click();
	}

	
	protected void goBack(AndroidDriver loc_driver) {
		loc_driver.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("back clicked");
	}
	
	protected void goHome(AndroidDriver loc_driver) {
		loc_driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		System.out.println("app switch clicked");
	}
	
	
	protected void allowPopUpPermissionsQuestions(AndroidDriver loc_driver) {
		while (loc_driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 
		{  
			loc_driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		}
	}
	
	protected void scrollToSpecificElement(AndroidDriver loc_driver, String elementToBeScrolledTo) {
		loc_driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
				+ ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + elementToBeScrolledTo + "\").instance(0))"));
	}
}
