package com.main.demo;

public class Runner_Class {

	public static void main(String[] args) {

		int a = 10;
		
		String s = "abc";
		
		String s1 = "vds";
		
		System.out.println(s);

		System.out.println(a);

		try {

			System.out.println(a / 0);
			
		} catch (Exception e) {

			System.out.println("Handled");

		}

		finally {

			System.out.println("Finally block");
		}

	}

}
