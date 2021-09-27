package com.comprehensive_hybrid.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprehensive_hybrid.reusablecomponent.ReusableMethods;
import com.comprehensive_hybrid.uistore.HeaderUI;
import com.comprehensive_hybrid.uistore.LivingPageUI;
import com.comprehensive_hybrid.uistore.SalePageUI;
import com.comprehensive_hybrid.uistore.SearchPageUI;
public class LivingPage {
	LivingPageUI li = new LivingPageUI();
	
	private WebDriver driver;
	
	public LivingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getLivingResult() {
		return ReusableMethods.getElement(driver, li.livingresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getMattress() {
		return ReusableMethods.getElement(driver, li.mattress);
	}

}
