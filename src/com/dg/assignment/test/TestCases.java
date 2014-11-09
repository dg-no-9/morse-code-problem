package com.dg.assignment.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.dg.assignment.Alphabets;
import com.dg.assignment.Finder;

public class TestCases {

	@Test
	public void test1() {
		String seq = "OOAO";
		basicTest(seq);
	}
	
	@Test
	public void test2() {
		String seq = "OOOAOAOAOOOAOAOOOOA";
		basicTest(seq);
	}
	
	private void basicTest(String sequence){
		Finder finder = new Finder(sequence);
		List<String> outputs = finder.getOutputs();
		for (String output: outputs){
			StringBuilder expected = new StringBuilder();
			for(char c: output.toCharArray()){
				if(c == '#') continue; //As first character is always # from the root Node.
				expected.append(Alphabets.M_CODE.get(c));
			}
			Assert.assertEquals(expected.toString(),sequence);
		}
	}

}
