package StackAndQueuesProblems;

public class Queue1 {

	Node front;
	Node rear;
	int length;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	
	public void inQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		} else {
			rear.next = new Node(data);
			rear = rear.next;
		}
		length++;
	}

	
	public void Show() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + "-");
			temp = temp.next;
		}
	}
}
