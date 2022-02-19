package com.selenium.demo;

public class Variable_Demo {

	 int age = 10; // class variable

	public void a() {

		int age = 16; // local variable

		System.out.println(age);

	}

	public void b() {

		age = 17;

		System.out.println(age);

	}

	public void c() {

		int age = 22; // ---> local 

		System.out.println(age);

	}

	public void d() {

		System.out.println(age);

	}

	public static void main(String[] args) {

		Variable_Demo demo = new Variable_Demo();

		demo.a();

		demo.b();

		demo.c();

		demo.d();

	}

}
