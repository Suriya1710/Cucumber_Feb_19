package com.pojo;

public class A {
	
	private int age = 10;  

	public int getAge() {
		return age;
	}

	public void setAge(int age) { // age = 22 from B class
		this.age = age;    // this.age= 22;  // age = 22
	}
	
	
	
	

}
