package com.demo;

public class Chrome_Driver implements Web_Driver{

	
	public void get(String url) {

		System.out.println("URL :"+url);
		
	}

	public void getTitle(String title) {

		System.out.println("Title : "+title);
		
	}
	
	public void chrome_Method() {

	}

	public static void main(String[] args) {
		
		//Web_Driver driver1 = new Web_Driver();
		
		Web_Driver driver = new Chrome_Driver(); // up casting
		
		// driver.
		
		Chrome_Driver chrome = new Chrome_Driver();
	
		//chrome.
	
	}
	
	
	
}
