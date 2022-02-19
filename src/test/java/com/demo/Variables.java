package com.demo;

public class Variables {

	static int a ; // class variable // a = 0;

	public void method1() {

		int a = 5;  // local variable

		System.out.println(a);

	}

	public void method2() {

		a = 15;

		System.out.println(a);

	}

	public void method3() {

		int a = 7;

		System.out.println(a);

	}

	public void method4() {

		System.out.println(a);

	}

	public static void main(String[] args) {

		Variables v = new Variables();

		v.method1();

		v.method2();

		v.method3();

		v.method4();

		System.out.println(a);
		
	}

}
