package com.Logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Confi {

	// factory design pattern

	static Logger log = Logger.getLogger(Basic_Confi.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();

		log.debug("DEBUG");

		log.info("INFO");

		log.warn("WARN");

		log.error("ERROR");

		log.fatal("FATAL");

	}

}
