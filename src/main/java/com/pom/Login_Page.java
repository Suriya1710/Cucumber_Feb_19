package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver; // ----> null

	@FindBy(id = "username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public Login_Page(WebDriver driver2) { // Test Runner driver

		this.driver = driver2; // this.driver = Test Runner Driver;

		PageFactory.initElements(driver, this);
		
	}

	

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login_Btn;

}
