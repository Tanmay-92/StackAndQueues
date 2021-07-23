package StackAndQueuesProblems;

public class Stack {

	Node top;
	int size;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {		
		Node Node1 = new Node(data);
		Node1.next = top;
		top = Node1;

		size++;
	}
	
    public void print(){		
		Node temp = top;
		while(temp != null){
			System.out.print(temp.data + "-");
			temp = temp.next;
		}
    }
}
