package com.dg.assignment;

import java.util.List;

//This Class is for testing.
public class Main {

	public static void main(String[] args) {
		// String seq = "OOOAOAOAOOOAOAO";
		String seq = "OOAO";
		Finder finder = new Finder(seq);
		List<String> outputs = finder.getOutputs();

	}

}