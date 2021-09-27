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
import com.comprehensive_hybrid.uistore.StoragePageUI;
public class StoragePage {
	StoragePageUI sp = new StoragePageUI();
	
	private WebDriver driver;
	
	public StoragePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getStorageResult() {
		return ReusableMethods.getElement(driver, sp.storageresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getStudyLamp() {
		return ReusableMethods.getElement(driver, sp.studylamps);
	}

}
