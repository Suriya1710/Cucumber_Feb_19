package com.demo;

public class String_Types {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java"); // Mutable String

		System.out.println(sb);

		System.out.println(System.identityHashCode(sb));

		StringBuffer sb1 = new StringBuffer("Java");

		System.out.println(sb1);

		System.out.println(System.identityHashCode(sb1));

		sb1 = sb1.append(sb);

		System.out.println(sb1);

		System.out.println(System.identityHashCode(sb1));

	}

}
