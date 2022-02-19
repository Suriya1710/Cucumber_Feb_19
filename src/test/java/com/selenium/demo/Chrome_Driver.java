package com.selenium.demo;

public class Chrome_Driver implements Web_Driver {

	
	public void get() {

		System.out.println("get");

	}

	public void getTitle() {

		System.out.println("get title");

	}

	public void chrome_Method() {

		System.out.println("Chrome Method");

	}

	public static void main(String[] args) {

		Chrome_Driver driver = new Chrome_Driver();

		driver.get();

		driver.getTitle();

		driver.chrome_Method();

		Web_Driver driver1 = new Chrome_Driver();

		driver1.getTitle();

	}

}
