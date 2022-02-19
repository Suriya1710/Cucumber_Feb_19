package com.Logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_File_Config {

	// factory design pattern

	static Logger log = Logger.getLogger(Property_File_Config.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		log.debug("Debug");

		log.info("Informational");

		log.warn("Warning");

		log.error("Error Mesg");

		log.fatal("Fatal Mesg");

	}

}
