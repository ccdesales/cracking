package com.cesarcd.ch1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cesarcd.ch1.StringCompressor;

class StringCompressorTest {

	@Test
	void testCompressString() {
		StringCompressor compressor = new StringCompressor();
		assertEquals(compressor.compressString("acbbbb"), "ac4b");
		assertEquals(compressor.compressString("acb ee"), "acb ee");
		assertNotEquals(compressor.compressString("acb ee"), "acb 2e");
		assertEquals(compressor.compressString("acb eee"), "acb 3e");
		assertNotEquals(compressor.compressString("acbb ee"), "ac2b 2e");
	}

}
