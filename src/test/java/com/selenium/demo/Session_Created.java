package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_Created {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Demo\\Jan_Project_Batchh\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // up casting

	}

}
