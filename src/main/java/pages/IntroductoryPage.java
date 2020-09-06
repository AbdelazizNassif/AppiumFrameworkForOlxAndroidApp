package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class IntroductoryPage extends PageBase{

	
	public IntroductoryPage(AndroidDriver driver) {
		super(driver);
		
	}
	
	private void chooseEgyptFromAvailableCountries(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.TextView[@text='Egypt']", "xpath");
		wait.until(ExpectedConditions.visibilityOf((AndroidElement)loc_driver.findElement(By.xpath("//android.widget.TextView[@text='Register Here']"))));
	}
	
	private  void clickPlaceAnAd(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.TextView[@text='Place an Ad']", "xpath");
	}
	
	
	
	public void navigateToAdDetails(AndroidDriver loc_driver)
	{
		chooseEgyptFromAvailableCountries(loc_driver);
		goBack(loc_driver);
		allowPopUpPermissionsQuestions(loc_driver);	
		clickPlaceAnAd(loc_driver);
		allowPopUpPermissionsQuestions(loc_driver);	
		allowPopUpPermissionsQuestions(loc_driver);	
	}
	
	
	

}
