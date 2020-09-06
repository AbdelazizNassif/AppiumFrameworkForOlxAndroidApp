package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AdvFormPage extends PageBase{

	public AdvFormPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//	protected void scrollToSpecificElement(AndroidDriver loc_driver, String elementToBeScrolledTo) {
	private void propertyAd_fillAdTitle(AndroidDriver loc_driver, String title)
	{
		wait.until(ExpectedConditions.visibilityOf((AndroidElement)loc_driver.findElement(By.xpath("//android.widget.EditText[@text='Title']"))));
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='Title']", title);
	}

	private void propertyAd_selectAdType(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.TextView[@text='Ad Type']", "xpath");
		clickElement(loc_driver, "//android.widget.CheckedTextView[@text='For Sale']", "xpath");

	}

	private void propertyAd_selectType(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.TextView[@text='Type']", "xpath");
		clickElement(loc_driver, "//android.widget.CheckedTextView[@text='Stand Alone Villa']", "xpath");
	}

	private void propertyAd_selectAdPrice(AndroidDriver loc_driver, String price)
	{
		clickElement(loc_driver, "//android.widget.Button[@text='Price (EGP)']", "xpath");
		inputStringToElement(loc_driver, "//android.widget.EditText[@resource-id='com.olxmena.horizontal:id/value']", price);
		clickElement(loc_driver, "//android.widget.CheckBox[@text='Price Negotiable']", "xpath");
		clickElement(loc_driver, "//android.widget.TextView[@text='OK']", "xpath");
		
	}
	
	private void propertyAd_selectAdAmeneties(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.Button[@text='Amenities']", "xpath");
		
		clickElement(loc_driver, "//android.widget.CheckedTextView[@text='Balcony']", "xpath");
		
		clickElement(loc_driver, "//android.widget.TextView[@text='READY']", "xpath");
		
	}
	
	private void propertyAd_selectAdBedrooms(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.TextView[@text='Bedrooms']", "xpath");
		clickElement(loc_driver, "//android.widget.CheckedTextView[@text='2']", "xpath");
	}
	
	private void propertyAd_selectAdBethrooms(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.TextView[@text='Bathrooms']", "xpath");
		clickElement(loc_driver, "//android.widget.CheckedTextView[@text='2']", "xpath");
	}
	
	private void propertyAd_inputArea(AndroidDriver loc_driver, String area)
	{
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='Area (m²)']", area);
	}
	
	private void propertyAd_selectCompound(AndroidDriver loc_driver)
	{
		clickElement(loc_driver, "//android.widget.Button[@text='Compound']", "xpath");
		
		clickElement(loc_driver, "//android.widget.TextView[@text='2020 Compound']", "xpath");
	}
	
	private void propertyAd_inputDescription(AndroidDriver loc_driver, String desc)
	{
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='Description']", desc);
	}
	
	private void propertyAd_AddLocation(AndroidDriver loc_driver, String city)
	{
		clickElement(loc_driver, "//android.widget.Button[@text='Ad Location']", "xpath");
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='   City or postal code']", city);
		
		clickElement(loc_driver, "//android.widget.TextView[@resource-id='com.olxmena.horizontal:id/small']", "xpath");
	}
	
	private void propertyAd_inputName(AndroidDriver loc_driver, String name)
	{		
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='Name']", name);
	}
	
	private void propertyAd_inputEmail(AndroidDriver loc_driver, String email)
	{		
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='E-mail']", email);
	}
	
	private void propertyAd_inpuPhone(AndroidDriver loc_driver, String phone)
	{		
		inputStringToElement(loc_driver, "//android.widget.EditText[@text='Phone']", phone);
	}
	
	private void propertyAd_submitForm(AndroidDriver loc_driver)
	{		
		clickElement(loc_driver, "//android.widget.Button[@text='Submit']", "xpath");
	}
	public void scenario(AndroidDriver loc_driver, String title, String price, String area, String desc, String threeLettersOfCity,String name, String email
													,String phone) 
	{
		propertyAd_fillAdTitle(loc_driver, title);
		propertyAd_selectAdType(loc_driver);
		propertyAd_selectType(loc_driver);
		propertyAd_selectAdPrice(loc_driver, price);
		scrollToSpecificElement(loc_driver, "Payment Option");
		propertyAd_selectAdAmeneties(loc_driver);
		propertyAd_selectAdBedrooms(loc_driver);
		propertyAd_selectAdBethrooms(loc_driver);
		propertyAd_inputArea(loc_driver, area);
		propertyAd_selectCompound(loc_driver);
		scrollToSpecificElement(loc_driver, "Phone");
		propertyAd_inputDescription(loc_driver, desc);
		
		propertyAd_AddLocation(loc_driver, threeLettersOfCity);
		 // test data
		// scroll to submit
		scrollToSpecificElement(loc_driver, "Submit");

		propertyAd_inputName( loc_driver,  name);
		propertyAd_inputEmail( loc_driver,  email);
		propertyAd_inpuPhone( loc_driver,  phone);
		//propertyAd_submitForm(loc_driver);
		
	}



}
