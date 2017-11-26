package com.cesarcd.ch1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cesarcd.ch1.PermutationChecker;

class PermutationCheckerTest {

	@Test
	void testIsPermutationOf() {
		PermutationChecker checker = new PermutationChecker();
		assertTrue(checker.isPermutationOf("", ""));
		assertTrue(checker.isPermutationOf("aabc", "cbaa"));
		assertTrue(checker.isPermutationOf("abc", "cba"));
		assertTrue(checker.isPermutationOf("abc 123", "132c ba"));
	}

}
