package control;

public class Node<E extends Comparable<E>> {

	Node<E> left;
	E node_value;
	Node<E> right;

	public Node(Node<E> child_left, E value, Node<E> child_right) {

		left = child_left;
		node_value = value;
		right = child_right;
	}

	public void addNode(Node<E> parentNode, int value) {

	}

}
