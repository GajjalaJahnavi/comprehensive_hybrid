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
import com.comprehensive_hybrid.uistore.StudyPageUI;
public class StudyPage {
	StudyPageUI st = new StudyPageUI();
	
	private WebDriver driver;
	
	public StudyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getStorageResult() {
		return ReusableMethods.getElement(driver, st.storageresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getKidsDecor() {
		return ReusableMethods.getElement(driver, st.kidsdecor);
	}

}
