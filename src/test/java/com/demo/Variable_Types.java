package com.demo;

public class Variable_Types {

	int age; // class variable  ----> 0

	public void method1() {

		int age = 17; // local variable

		System.out.println(age);

	}

	public void method2() {

		age = 25; // value changed

		System.out.println(age);

	}

	public void method3() {

		System.out.println(age);

	}

	public static void main(String[] args) {

		Variable_Types v = new Variable_Types();

		v.method1();

		v.method2();

		v.method3();

	}

}
