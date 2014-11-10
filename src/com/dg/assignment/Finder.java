package com.dg.assignment;

import java.util.ArrayList;
import java.util.List;

import com.dg.assignment.tree.Node;
import com.dg.assignment.tree.Tree;

public class Finder {
	private Tree<Character> tree;
	private List<String> matrix;
	
	public Finder(String sequence) {
		Node<Character> root = new Node<Character>('#');
		root.setNodeWeight(0);
		tree = new Tree<Character>(root);
		matrix = new ArrayList<String>();
		buildMatrix(sequence);
		buildTree(root);
	} 

	private void buildMatrix(String sequence) {
		int length = sequence.length();
		for (int i = 0; i < length; i++) {
			boolean readingEnded = false;
			StringBuilder possibleChars = new StringBuilder();
			for (int j = 1; j <= 5; j++) {
				int lastIndex = i + j;
				String substring = "";
				if (lastIndex >= length) {
					lastIndex = length;
					readingEnded = true;
				}
				substring = sequence.substring(i, lastIndex);

				switch (substring.length()) {
				case 1:
					Character c = Codes.ONE_CHARS.get(substring);
					possibleChars.append(c);
					break;
				case 2:
					c = Codes.TWO_CHARS.get(substring);
					possibleChars.append(c);
					break;
				case 3:
					c = Codes.THREE_CHARS.get(substring);
					possibleChars.append(c);
					break;
				case 4:
					c = Codes.FOUR_CHARS.get(substring);
					if (c != null) {
						possibleChars.append(c);
					}
					break;
				case 5:
					c = Codes.FIVE_CHARS.get(substring);
					if (c != null) {
						possibleChars.append(c);
					}
					break;
				}
				if (readingEnded) {
					break;
				}
			
			}
			matrix.add(possibleChars.toString());
		}
	}

	private void buildTree(Node<Character> currentNode) {
		if (currentNode.getNodeWeight() >= matrix.size()) {
			return;
		}
		String children = matrix.get(currentNode.getNodeWeight());
		for (char c : children.toCharArray()) {
			Node<Character> newNode = new Node<Character>(c);
			newNode.setNodeWeight(currentNode.getNodeWeight() + Alphabets.getWeight(c));
			currentNode.addChild(newNode);
			buildTree(newNode);
		}
	}

	public List<String> getOutputs() {
		List<List<Node<Character>>> paths = tree.traverse();
		List<String> outputs = new ArrayList<String>();
		for (List<Node<Character>> path : paths) {
			StringBuilder builder = new StringBuilder();
			for (Node<Character> c : path) {
				builder.append(c);
			}
			outputs.add(builder.toString());
		}
		return outputs;
	}
}
