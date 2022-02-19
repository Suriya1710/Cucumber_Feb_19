package com.constructordemo;

public class Demo {

	public Demo() {

		System.out.println(".xlsx into File");

		System.out.println("use fis");

		System.out.println("object for workbook");

	}

	public void particular_Data() {

		System.out.println("traverse into sheet");

		System.out.println("traverse into row index");

		System.out.println("traverse into cell index");

		System.out.println("check the cell type");

		System.out.println("depends upon the condition it will print value");

		System.out.println("close the worrkbook");

	}

	public void particular_Row_Data() {

		System.out.println("traverse into sheet");

		System.out.println("using for loop we iterate the row");

		System.out.println("traverse into row index");

		System.out.println("traverse into cell index");

		System.out.println("check the cell type");

		System.out.println("depends upon the condition it will print value");

		System.out.println("close the worrkbook");

	}

	public static void main(String[] args) {

		Demo d = new Demo();

		d.particular_Data();

		System.out.println("******NEXT METHOD****");

		System.out.println();

		System.out.println();

		d.particular_Row_Data();

	}

}
