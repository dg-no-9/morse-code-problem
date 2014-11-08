package com.dg.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.dg.assignment.tree.Node;
import com.dg.assignment.tree.Tree;

public class Main {

	/**
	 * @param args
	 */

	private static List<String> matrix = new ArrayList<String>();

	public static void main(String[] args) {
		// String seq = "OOOAOAOAOOOAOAO";
		String seq = "AOOOOOAOA";
		// String seq = "OOAO";
		buildMatrix(seq);
		Node<Character> root = new Node<Character>('#');
		root.setNodeWeight(0);
		buildTree(root);
		// treeTest(tree);
		Tree<Character> tree = new Tree<Character>(root);
		showTree(tree);

	}

	public static void buildMatrix(String sequence) {
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
				//System.out.println(substring);
				if (readingEnded) {
					break;
				}

			}
			System.out.println(possibleChars.toString());
			matrix.add(possibleChars.toString());
		}
	}

	public static void buildTree(Node<Character> currentNode) {
		if (currentNode.getNodeWeight() >= matrix.size()) {
			// Node<Character> newNode = new Node<Character>('#');
			// currentNode.addChild(newNode);
			return;
		}
		// for(Node<Character> n: currentNode.getChildren()){
		// System.out.println(currentNode.getData());
		// }
		String children = matrix.get(currentNode.getNodeWeight());
		// System.out.println(currentNode.getData()+ ":" + children);
		int intValue = 1;
		for (char c : children.toCharArray()) {
			Node<Character> newNode = new Node<Character>(c);
			newNode.setNodeWeight(currentNode.getNodeWeight() + intValue);
			intValue++;
			currentNode.addChild(newNode);
			buildTree(newNode);
		}
	}

	public static void showTree(Tree<Character> tree) {
		List<List<Node<Character>>> paths = tree.traverse();
		for (List<Node<Character>> path : paths) {
			for (Node<Character> c : path) {
				System.out.print(c.getData());
			}
			System.out.println();
		}
		System.out.println("Total Outputs:" + paths.size());
	}
}
