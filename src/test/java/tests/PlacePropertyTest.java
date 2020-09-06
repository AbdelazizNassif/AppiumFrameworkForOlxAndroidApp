package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pages.AdvFormPage;
import pages.IntroductoryPage;
import pages.PropertiesPage;

public class PlacePropertyTest extends TestBase{
	
	IntroductoryPage introObj;
	PropertiesPage propObj;
	AdvFormPage adFormObj;
	
	@BeforeClass
	public void setUpClassTests()
	{
		introObj = new IntroductoryPage(driver);
		propObj = new PropertiesPage(driver);
		adFormObj = new AdvFormPage(driver);
	}
	
	@Test(priority = 1)
	public void navigateToAdvForm() throws InterruptedException
	{
		System.out.println("This is to navigate to the ad form");
		introObj.navigateToAdDetails(driver);
		// Assertions 
		propObj.selectPropertiesCategory(driver);
		// Assertions 
	}
	
	@Test(priority = 2)
	public void fillAdvForm()
	{
/*scenario(AndroidDriver loc_driver, String title, String price, String area, String desc, String name, String email
													,String phone)*/
		System.out.println("This is to fill the ad form");
		adFormObj.scenario(driver, "Adv title", "20000", "1000" , "This i the best in the town", "Maa" ,"Ahma", "esc@gmail.com", "01066441745");
	}
	

}
