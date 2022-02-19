package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Social Media")
	private void whatsapp() {

		System.out.println("Whatsapp");

	}

	@Test(groups = "Music")
	private void spotify() {

		System.out.println("Spotify");

	}

	@Test(groups = "Social Media")
	private void facebook() {

		System.out.println("Facebook");

	}

	@Test(groups = "Social Media")
	private void instagram() {

		System.out.println("Instagram");

	}

	@Test(groups = "Music")
	private void wynkMusic() {

		System.out.println("Wynk Music");

	}

	@Test
	private void books() {

		System.out.println("Books");

	}
	
	@Test
	private void novels() {

		System.out.println("Novels");
		
	}
	
}
