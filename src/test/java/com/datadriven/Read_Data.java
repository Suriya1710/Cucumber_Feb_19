package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.demo.Chrome_Driver;

public class Read_Data {

	public static void particular_Data() throws IOException {

		File f = new File("C:\\Eclipse\\Demo\\Jan_Project_Batchh\\Test_Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();

			System.out.println(stringCellValue);

		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int value = (int) numericCellValue; // narrowing

			System.out.println(value);

		}
		
		wb.close();

	}

	public static void all_Data() throws Throwable {

		File f = new File("C:\\Eclipse\\Demo\\Jan_Project_Batchh\\Test_Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int numberOfRows = s.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) // ---> iterate all rows

		{

			Row r = s.getRow(i);

			int numberOfCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) // iterate all cells

			{

				Cell c = r.getCell(j);

				// Step 7 : check the cell type

				CellType cellType = c.getCellType();

				// Step 8 : using if condition check the cell type

				if (cellType.equals(CellType.STRING))

				{

					String value = c.getStringCellValue();

					System.out.println(value);

				}

				else if (cellType.equals(CellType.NUMERIC))

				{

					double d = c.getNumericCellValue();

					int value = (int) d; // ----> narrowing type casting

					System.out.println(value);

				}

			}

		}
		
		

		wb.close();
	}

	public static void main(String[] args) throws Throwable {

		// particular_Data();

		System.out.println("******ALL DATA************");

		all_Data();

	}

}
