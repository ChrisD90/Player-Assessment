package control;

public class Node <E extends Comparable <E>>{
	
	Node <E> left;
	E elem;
	Node <E> right;
	
	public Node (Node <E> child_left, E parent, Node<E> child_right){
		
		left=child_left;
		elem =parent;
		right =child_right;
	}

}
