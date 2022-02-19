package com.demo.constructor;

public class Demo_Runner {

	public static void main(String[] args) {
		
		System.out.println("Browser launch");
		
		String url = FRM.getInstanceFRM().getInstanceCR().get_Url();
		
		System.out.println(url);
		
		String username = FRM.getInstanceFRM().getInstanceCR().get_Username();
		
		System.out.println(username);
	
		System.out.println("driver close");
		
	}
	
	
	
}
