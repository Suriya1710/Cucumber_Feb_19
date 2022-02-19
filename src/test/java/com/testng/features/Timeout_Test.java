package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test(timeOut = 6000)
	private void launch_Browser() throws InterruptedException {

		System.out.println("Browser Launch");

		Thread.sleep(3000); // browser launch execute time

		System.out.println("username");

		System.out.println("password");

		System.out.println("login button");

		Thread.sleep(2000); // credentials execution time

		Thread.sleep(1000); // real thread .sleep 

		System.out.println("navigate to home page");

	}

}
