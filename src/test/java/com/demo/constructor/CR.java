package com.demo.constructor;

public class CR {

	public CR() {

		System.out.println(".properties into file");

		System.out.println("read the file by using fis");

		System.out.println("obj for properties");

		System.out.println("load the file");

	}

	public String get_Url() {

		System.out.println("using getProperty(key)");

		System.out.println("return the value");

		String url = "google.com";

		return url;

	}

	public String get_Username() {

		System.out.println("using getProperty(key)");

		System.out.println("return the value");

		String username = "Starc";

		return username;

	}

}
