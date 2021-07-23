package StackAndQueuesProblems;

public class Queue2 {
	Node front;
	Node rear;
	int length;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void InQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		}
		else {
			rear.next = new Node(data);
			rear = rear.next;
		}
		length ++;
	}
	
	public void Show() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data + "-");
			temp = temp.next;
		}
	}

	public void DeQueue() {
		int temp;
		if (front != null) {
			temp = front.data;
			front = front.next;
			length--;
			return;
		}
		System.out.println("Data Removed");
		
	}
}
