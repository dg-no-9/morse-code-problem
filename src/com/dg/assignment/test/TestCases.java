package com.dg.assignment.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.dg.assignment.Alphabets;
import com.dg.assignment.Finder;

public class TestCases {

	boolean print = false;
	@Test
	public void simpleTest() {
		String seq = "OOAO";
		print = false;
		setupAndTest(seq);
	}
	
	@Test
	public void testWithoutNumbers() {
		String seq = "OOOAOAOAOOOAOAO";
		print = true;
		setupAndTest(seq);
	}
	
	@Test
	public void testHavingNumbersInBetween() {
		String seq = "AOOAOAOOOOOAOAO";
		print = false;
		setupAndTest(seq);
	}
	
	@Test
	public void testHavingNumbersOnlyCase() {
		String seq = "OOOOOAAAAA";
		print = false;
		setupAndTest(seq);
	}
	
	private void setupAndTest(String sequence){
		Finder finder = new Finder(sequence);
		List<String> outputs = finder.getOutputs();
		System.out.println("Total Outputs:" + outputs.size());
		for (String output: outputs){
			StringBuilder expected = new StringBuilder();
			for(char c: output.toCharArray()){
				if(c == '#') continue; //As first character is always # from the root Node.
				expected.append(Alphabets.M_CODE.get(c));
				if(output.equals("#EEEEE0T")) System.out.println(c);
			}
			if(print){
				System.out.print(output.substring(1,output.length()));
			}
			
			Assert.assertEquals(expected.toString(),sequence);
		}
	}

}
