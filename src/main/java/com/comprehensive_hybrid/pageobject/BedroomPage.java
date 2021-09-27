package com.comprehensive_hybrid.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprehensive_hybrid.reusablecomponent.ReusableMethods;
import com.comprehensive_hybrid.uistore.BedroomPageUI;
import com.comprehensive_hybrid.uistore.HeaderUI;
import com.comprehensive_hybrid.uistore.LivingPageUI;
import com.comprehensive_hybrid.uistore.SalePageUI;
import com.comprehensive_hybrid.uistore.SearchPageUI;
public class BedroomPage {
	BedroomPageUI bp = new BedroomPageUI();
	
	private WebDriver driver;
	
	public BedroomPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getBedroomResult() {
		return ReusableMethods.getElement(driver, bp.bedroomresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getDiningStorage() {
		return ReusableMethods.getElement(driver, bp.diningstorage);
	}

}
