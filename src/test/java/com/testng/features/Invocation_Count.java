package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("Set property");
	}

	@Test(priority = 0)
	private void url() {
		System.out.println("url");
	}

	@Test(priority = 0)
	private void browserLaunch() {

		System.out.println("Browser launch");
	}

	@Test(priority = 1, invocationCount = 2)
	private void refresh() {

		System.out.println("Refresh");
	}

}
