package com.demo;

public class Memory_Code {

	public static void main(String[] args) {

		String s = "Starc"; // ImMutable String

		System.out.println(s);

		System.out.println(System.identityHashCode(s));

		String s1 = "Starc";

		System.out.println(s1);

		System.out.println(System.identityHashCode(s1));

		s = s + s1;

		System.out.println(s);

		System.out.println(System.identityHashCode(s));

	}

}
