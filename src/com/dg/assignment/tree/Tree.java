package com.dg.assignment.tree;

import java.util.LinkedList;
import java.util.List;

public class Tree<T> {

	private Node<T> root;

	public Tree(Node<T> root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return (root == null) ? true : false;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public List<List<Node<T>>> traverse() {
		// assume root != NULL
		List<List<Node<T>>> paths = new LinkedList<List<Node<T>>>();
		traverse(root, new LinkedList<Node<T>>(), paths);
		return paths;
	}

	private void traverse(Node<T> node, LinkedList<Node<T>> path,
			List<List<Node<T>>> paths) {
		path.add(node);
		if (node.isLeaf()) {
			paths.add(path);
		} else {
			for (Node<T> n : node.getChildren()) {
				traverse(n, new LinkedList<Node<T>>(path), paths);
			}
		}
	}
}
