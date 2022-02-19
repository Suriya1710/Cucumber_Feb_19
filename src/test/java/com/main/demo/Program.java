package com.main.demo;

public class Program {

	public static void main(String[] args) {

		int a = 153; // original

		int value = 0, rem = 0;

		int temp = a; // temporary

		while (temp > 0) {

			rem = temp % 10; // remainder

			value = value + (rem * rem * rem);

			temp = temp / 10; // quotient

		}

		if (a == value) {

			System.out.println("Armstrong Number");

		}

		else {

			System.out.println("Not Armstrong Number");

		}

	}

}
