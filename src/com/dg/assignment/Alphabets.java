package com.dg.assignment;

import java.util.HashMap;
import java.util.Map;

public class Alphabets {
	public static final Map<Character, String> M_CODE;
	
	static
	{
		M_CODE = new HashMap<Character, String>();
		M_CODE.put('A', "OA");
		M_CODE.put('B', "AOOO");
		M_CODE.put('C', "AOAO");
		M_CODE.put('D', "AOO");
		M_CODE.put('E', "O");
		M_CODE.put('F', "OOAO");
		M_CODE.put('G', "AAO");
		M_CODE.put('H', "OOOO");
		M_CODE.put('I', "OO");
		M_CODE.put('J', "OAAA");
		M_CODE.put('K', "AOA");
		M_CODE.put('L', "OAOO");
		M_CODE.put('M', "AA");
		M_CODE.put('N', "AO");
		M_CODE.put('O', "AAA");
		M_CODE.put('P', "OAAO");
		M_CODE.put('Q', "AAOA");
		M_CODE.put('R', "OAO");
		M_CODE.put('S', "OOO");
		M_CODE.put('T', "A");
		M_CODE.put('U', "OOA");
		M_CODE.put('V', "OOOA");
		M_CODE.put('W', "OAA");
		M_CODE.put('X', "AOOA");
		M_CODE.put('Y', "AOAA");
		M_CODE.put('Z', "AAOO");
		
		M_CODE.put('1', "OAAAA");
		M_CODE.put('2', "OOAAA");
		M_CODE.put('3', "OOOAA");
		M_CODE.put('4', "OOOOA");
		M_CODE.put('5', "OOOOO");
		M_CODE.put('6', "AOOOO");
		M_CODE.put('7', "AAOOO");
		M_CODE.put('8', "AAAOO");
		M_CODE.put('9', "AAAAO");
		M_CODE.put('0', "AAAAA");
		
	}
	
	public static int getWeight(char c){
		return Alphabets.M_CODE.get(c).length();
	}
	
}
