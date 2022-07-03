package com.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testconcat() {
		App app = new App();
		assertEquals("emnakamoun",app.concat("emna", "kamoun"));
		System.out.println("__helloworld__");
	}
	@Test(timeout=20)
	public void testperformance() {
		App app = new App();
		app.performance();
	}

}
