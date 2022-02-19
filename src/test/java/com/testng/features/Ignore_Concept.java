package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test(enabled = false)
	private void whatsapp() {

		System.out.println("Whatsapp");

	}

	@Test
	private void spotify() {

		System.out.println("Spotify");

	}

	@Test
	private void facebook() {

		System.out.println("Facebook");

	}

	@Test
	private void instagram() {

		System.out.println("Instagram");

	}

	@Test
	private void wynkMusic() {

		System.out.println("Wynk Music");

	}

	@Ignore
	@Test
	private void books() {

		System.out.println("Books");

	}

}
