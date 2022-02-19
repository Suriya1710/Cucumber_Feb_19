package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setProperty() {

		System.out.println("Set property");

	}

	@AfterSuite
	private void delete_Cookies() {

		System.out.println("Delete All Cookies");

	}

	@BeforeTest
	private void browser_Launch() {

		System.out.println("Browser launch");

	}

	@AfterTest
	private void browser_Close() {

		System.out.println("Close");

	}

	@BeforeClass
	private void getUrl() {

		System.out.println("getUrl");

	}

	@AfterClass
	private void verify_HomePage() {

		System.out.println("Home page");

	}

	@Test
	private void men() {

		System.out.println("men");

	}

	@BeforeMethod
	private void signin() {

		System.out.println("Signin");

	}

	@AfterMethod
	private void signoff() {

		System.out.println("signoff");

	}

	@Test
	private void women() {

		System.out.println("women");

	}

	@Test
	private void child() {

		System.out.println("child");

	}

}
