package com.cesarcd.ch1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cesarcd.ch1.UniqueCharsDetector;

class UniqueCharsDetectorTest {

	@Test
	void testHasUniqueChars() {
		UniqueCharsDetector detector = new UniqueCharsDetector();
        assertTrue(detector.hasUniqueChars("Cesar"));
        assertTrue(detector.hasUniqueChars("abcde"));
        assertFalse(detector.hasUniqueChars("aabcd"));
        assertFalse(detector.hasUniqueChars("abcdeefg"));
        assertFalse(detector.hasUniqueChars("abcd ee fg"));
        assertFalse(detector.hasUniqueChars("aabcd e fgg"));
	}

}
