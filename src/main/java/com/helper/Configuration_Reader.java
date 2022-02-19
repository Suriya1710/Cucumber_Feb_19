package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p; // null

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Eclipse\\Demo\\Jan_Project_Batchh\\src\\main\\java\\com\\configuration\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		 p = new Properties();

		p.load(fis);

	}

	public String get_Url_Data() throws Throwable {

		String url = p.getProperty("url");

		return url;

	}

	public String get_Username() throws Throwable {

		String username = p.getProperty("username");

		return username;

	}

}
