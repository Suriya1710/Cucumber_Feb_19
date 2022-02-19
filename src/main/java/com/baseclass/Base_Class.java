package com.baseclass;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver; // ----> null

	public static String value ; // ----> null
	
	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void close() {

		driver.close();

	}

	public static void dropdown(String type, WebElement element, String data) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byIndex")) {

			int value = Integer.parseInt(data);

			s.selectByIndex(value);

		}

		else if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(data);

		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

			s.selectByVisibleText(data);

		}

	}

	public static void selectByValue(WebElement element, String value) {

//		 Select s = new Select(element);
//		
//		s.selectByValue(value);

	}

	public static void takesSnap(String location) {

	}

	public static String particular_Data(String path, int row_Index, int cell_Index) throws Throwable {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis); // Up casting

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(cell_Index);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			 value = cell.getStringCellValue();

		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			 int val = (int) numericCellValue;

			value = String.valueOf(val);
			
		}

		return value;

	}

	
	
	
	
	
	
	
	
	
	
	
}
