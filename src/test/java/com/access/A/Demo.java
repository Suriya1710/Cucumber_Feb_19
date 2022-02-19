package com.access.A;

import com.accessspecifiers.Acess_Specifiers;

public class Demo extends Acess_Specifiers {

	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		
		d.method1(); // ----> protected method

		Acess_Specifiers a = new Acess_Specifiers();

		a.method2();
		
		// a.m
		
	}

}
