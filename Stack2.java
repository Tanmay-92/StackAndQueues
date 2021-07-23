package StackAndQueuesProblems;

public class Stack2 {

	public class Node {
		int data;
		Node next;
	}

	private Node top;

	public Stack2() {
		this.top = null;
	}


	public void push(int x) {
		Node node1 = new Node();
		System.out.println("Inserting The Element " + x);
		node1.data = x;
		node1.next = top;
		top = node1;
	}

	public boolean isEmpty() {
		return top == null;
	}

	
	public int peak() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("The Stack is Empty");
			return -1;
		}
	}

	
	public void pop() {
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}
		System.out.println("Removing The Element " + peak());
		top = (top).next;
	}
}
