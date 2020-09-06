package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PropertiesPage extends PageBase{

	public PropertiesPage(AndroidDriver driver) {
		super(driver);
	}
	
	
	public void selectPropertiesCategory(AndroidDriver loc_driver)
	{		
		clickElement(loc_driver, "//android.widget.TextView[@text='Properties']", "xpath");		
		clickElement(loc_driver, "//android.widget.TextView[@text='Villas For Sale']", "xpath");
	}

}
