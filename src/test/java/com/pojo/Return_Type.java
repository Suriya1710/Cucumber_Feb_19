package com.pojo;

public class Return_Type {

	public int method1() {

		int age = 10;

		return age;

	}

	public String method2(String name) {

		return name;

	}

	public void method3() {

		int a = 5;

	}

	public static void main(String[] args) {

		Return_Type a = new Return_Type();

		int value = a.method1();

		System.out.println(value);

		String data = a.method2("Starc");

		System.out.println(data);

		a.method3();

	}

}
