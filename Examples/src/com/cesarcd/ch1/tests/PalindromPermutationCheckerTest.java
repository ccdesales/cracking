package com.cesarcd.ch1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cesarcd.ch1.PalindromPermutationChecker;

class PalindromPermutationCheckerTest {

	@Test
	void testIsPermutationOfPalindromString() {
		PalindromPermutationChecker checker = new PalindromPermutationChecker();
		assertTrue(checker.isPermutationOfPalindrom("abcba"));
		assertTrue(checker.isPermutationOfPalindrom("ccabcba"));
		assertTrue(checker.isPermutationOfPalindrom("cccbbaa"));
		
		assertFalse(checker.isPermutationOfPalindrom("cccbbaax"));
	}

}
