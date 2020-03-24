package junitepam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Deletee {
	/*
	 * 	Ex: 
	 * 	“ABCD” => “BCD”   	test1stPositionChar		success
 		“AACD” => “CD”		testFirst2Chars			success
 		“BACD” => “BCD”		test2ndPositionChar		success
 		“BBAA” => “BBAA”	test2CharsWithoutA		success
 		“AABAA” => “BAA”	testFirst2Chars			success
 		"AA" => ""			testFirst2Chars			success
 		"" => ""			testEmptyChar			success
 		"A" => ""			testWhenLengthIs1		success
 		"CCDD" => "CCDD"	testNoChange4			success
 		"B" => "B"			testIfLengthIs1			success
	 */
	@Test
	void test1stPositionChar() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("BCD",removeaFromfirst2characters.remove("ABCD"));
	}
	
	@Test
	void test2ndPositionChar() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("BCD",removeaFromfirst2characters.remove("BACD"));
	}
	
	@Test
	void testFirst2Chars() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("CD",removeaFromfirst2characters.remove("AACD"));
	}
	
	@Test
	void test2CharsWithoutA() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("BBAA",removeaFromfirst2characters.remove("AABBAA"));
	}
	
	@Test
	void testEmptyChar() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("",removeaFromfirst2characters.remove(""));
	}
	
	@Test
	void testWhenLengthIs1() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("",removeaFromfirst2characters.remove("A"));
	}
	
	@Test
	void testNoChange() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("CCDD",removeaFromfirst2characters.remove("CCDD"));
	}
	
	@Test
	void testIfLengthIs1() {
		RemoveA removeaFromfirst2characters = new RemoveA();
		assertEquals("B",removeaFromfirst2characters.remove("B"));
	}
}
