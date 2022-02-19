package com.Runner; 

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;
import com.helper.File_Reader_Manager;
import com.helper.Page_Object_Manager;
import com.pom.Login_Page;
import com.pom.Search_Hotel;

public class Test_Runner extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome"); // ---> chrome

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	static Logger log = Logger.getLogger(Test_Runner.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_Url_Data();

		getUrl(url);

		log.info("Browser Launch");

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_Username();
		
		inputValueElement(pom.getInstanceLogin().getUsername(), username);

		// String password = particular_Data("D:\\Test Cases\\testcase1 - Copy.xlsx", 7,
		// 5);

	//	inputValueElement(pom.getInstanceLogin().getPassword(), password);

		log.info("Fetch the username and password from excel");

		clickOnElement(pom.getInstanceLogin().getLogin_Btn());

		clickOnElement(pom.getInstanceHotel().getSearch_Btn());

		driver.close();

		log.info("Driver Close");

	}

}
