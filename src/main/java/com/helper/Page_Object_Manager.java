package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Login_Page;
import com.pom.Search_Hotel;

public class Page_Object_Manager {

	public WebDriver driver; // -----> null

	// private ClassName objName;

	private Login_Page login; // ----> null

	private Search_Hotel hotel; // null

	public Page_Object_Manager(WebDriver abc) {

		this.driver = abc; // ----> Runner class driver

	}

	public Login_Page getInstanceLogin() {

		if (login == null) {

			login = new Login_Page(driver); // object

		}

		return login;

	}

	public Search_Hotel getInstanceHotel() {

		if (hotel == null) {

			hotel = new Search_Hotel(driver);

		}

		return hotel;
	}

}
