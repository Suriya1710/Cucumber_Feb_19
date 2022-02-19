package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void write_Data() throws Throwable {

		File f = new File("C:\\Users\\Itachi_Uchiha\\Desktop\\Write_Demo.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");

		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");

		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Starc");

		wb.getSheet("Data").getRow(1).createCell(1).setCellValue(1710);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		System.out.println("Data Created Successfully");
	}

	public static void main(String[] args) throws Throwable {

		write_Data();

	}

}
