package com.dg.assignment.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.dg.assignment.Alphabets;
import com.dg.assignment.Finder;

public class TestCases {

	@Test
	public void test() {
		String seq = "OOAO";
		Finder finder = new Finder(seq);
		List<String> outputs = finder.getOutputs();
		for (String output: outputs){
			StringBuilder expected = new StringBuilder();
			for(char c: output.toCharArray()){
				expected.append(Alphabets.M_CODE.get(c));
			}
			Assert.assertEquals(expected, "#" + seq);
		}
	}

}
