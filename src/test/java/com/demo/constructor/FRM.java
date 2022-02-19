package com.demo.constructor;

public class FRM {
	
	// Singleton Design Pattern 
	
	private FRM() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static FRM getInstanceFRM() {

		FRM frm = new FRM();
		
		return frm;
		
		
	}
	
	
	
	public  CR getInstanceCR() {

		CR cr = new CR();
		
		return cr;
		
		
	}
	
	
	

}
