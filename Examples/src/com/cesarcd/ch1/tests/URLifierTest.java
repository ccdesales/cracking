package com.cesarcd.ch1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cesarcd.ch1.URLifier;

class URLifierTest {

	@Test
	void testUrlify() {
		URLifier urlfier = new URLifier();
		assertEquals(urlfier.urlify("abc def  ", 7), "abc%20def");
		assertEquals(urlfier.urlify("abc  def    ", 8), "abc%20%20def");
		assertEquals(urlfier.urlify("abc d ef    ", 8), "abc%20d%20ef");
		assertEquals(urlfier.urlify("abc d  ef      ", 9), "abc%20d%20%20ef");
	}
}
