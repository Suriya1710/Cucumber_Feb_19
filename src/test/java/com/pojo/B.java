package com.pojo;

public class B {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		int age = a.getAge();
		
		System.out.println("Age : "+age);
		
		a.setAge(22); // ----> value set 
		
		System.out.println("After use setters");
		
		int value = a.getAge();
		
		System.out.println("Age : "+value);
		
	}
	
	
	

}
