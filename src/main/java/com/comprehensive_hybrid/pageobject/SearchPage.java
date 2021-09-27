package com.comprehensive_hybrid.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprehensive_hybrid.reusablecomponent.ReusableMethods;
import com.comprehensive_hybrid.uistore.HeaderUI;
import com.comprehensive_hybrid.uistore.SearchPageUI;
public class SearchPage {
	SearchPageUI s = new SearchPageUI();
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getSearchResult() {
		return ReusableMethods.getElement(driver, s.searchresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getSale() {
		return ReusableMethods.getElement(driver, s.sale);
	}

}
