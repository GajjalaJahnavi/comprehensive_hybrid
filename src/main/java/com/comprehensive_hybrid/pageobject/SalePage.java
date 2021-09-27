package com.comprehensive_hybrid.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprehensive_hybrid.reusablecomponent.ReusableMethods;
import com.comprehensive_hybrid.uistore.HeaderUI;
import com.comprehensive_hybrid.uistore.SalePageUI;
import com.comprehensive_hybrid.uistore.SearchPageUI;
public class SalePage {
	SalePageUI sa = new SalePageUI();
	
	private WebDriver driver;
	
	public SalePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getSaleResult() {
		return ReusableMethods.getElement(driver, sa.saleresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getSofaSet() {
		return ReusableMethods.getElement(driver, sa.sofaset);
	}

}
