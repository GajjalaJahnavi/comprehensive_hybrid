package com.comprehensive_hybrid.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprehensive_hybrid.reusablecomponent.ReusableMethods;
import com.comprehensive_hybrid.uistore.BedroomPageUI;
import com.comprehensive_hybrid.uistore.DiningPageUI;
import com.comprehensive_hybrid.uistore.HeaderUI;
import com.comprehensive_hybrid.uistore.LivingPageUI;
import com.comprehensive_hybrid.uistore.SalePageUI;
import com.comprehensive_hybrid.uistore.SearchPageUI;
public class DiningPage {
	DiningPageUI dp = new DiningPageUI();
	
	private WebDriver driver;
	
	public DiningPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getDiningResult() {
		return ReusableMethods.getElement(driver, dp.diningresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getShopByRange() {
		return ReusableMethods.getElement(driver, dp.shopbyrange);
	}

}
