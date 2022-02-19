package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver; // ---> null

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search_Btn;

	public Search_Hotel(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

}
