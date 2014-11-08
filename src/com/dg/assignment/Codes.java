package com.dg.assignment;

import java.util.HashMap;
import java.util.Map;

public class Codes {

	public static final Map<String, Character> ONE_CHARS;
	static
	{
		ONE_CHARS = new HashMap<String, Character>();
		ONE_CHARS.put("O", 'E');
		ONE_CHARS.put("A",'T');
	}

	public static final Map<String, Character> TWO_CHARS;
	static
	{
		TWO_CHARS = new HashMap<String, Character>();
		TWO_CHARS.put("OA", 'A');
		TWO_CHARS.put("AO",'N');
		TWO_CHARS.put("OO",'I');
		TWO_CHARS.put("AA",'M');
	}
	
	public static final Map<String, Character> THREE_CHARS;
	static
	{
		THREE_CHARS = new HashMap<String, Character>();
		THREE_CHARS.put("AOO", 'D');
		THREE_CHARS.put("AAO",'G');
		THREE_CHARS.put("AOA",'K');
		THREE_CHARS.put("AAA",'O');
		THREE_CHARS.put("OAO",'R');
		THREE_CHARS.put("OOO",'S');
		THREE_CHARS.put("OOA",'U');
		THREE_CHARS.put("OAA",'W');
	}
	
	public static final Map<String, Character> FOUR_CHARS;
	static
	{
		FOUR_CHARS = new HashMap<String, Character>();
		FOUR_CHARS.put("AOOO", 'B');
		FOUR_CHARS.put("AOAO",'C');
		FOUR_CHARS.put("OOAO",'F');
		FOUR_CHARS.put("OOOO",'H');
		FOUR_CHARS.put("OAAA",'J');
		FOUR_CHARS.put("OAOO",'L');
		FOUR_CHARS.put("OAAO",'P');
		FOUR_CHARS.put("AAOA",'Q');
		FOUR_CHARS.put("OOOA",'V');
		FOUR_CHARS.put("AOOA",'X');
		FOUR_CHARS.put("AOAA",'Y');
		FOUR_CHARS.put("AAOO",'Z');
		
	}
	
	public static final Map<String, Character> FIVE_CHARS;
	static
	{
		FIVE_CHARS = new HashMap<String, Character>();
		FIVE_CHARS.put("OAAAA",'1');
		FIVE_CHARS.put("OOAAA",'2');
		FIVE_CHARS.put("OOOAA",'3');
		FIVE_CHARS.put("OOOOA",'4');
		FIVE_CHARS.put("OOOOO",'5');
		FIVE_CHARS.put("AOOOO",'6');
		FIVE_CHARS.put("AAOOO",'7');
		FIVE_CHARS.put("AAAOO",'8');
		FIVE_CHARS.put("AAAAO",'9');
		FIVE_CHARS.put("AAAAA",'0');
		
	}
	
	
}
