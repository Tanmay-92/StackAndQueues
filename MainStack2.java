package StackAndQueuesProblems;

public class MainStack2 {
	public class Node {
		int data;
		Node next;
	}

	public void print() {
		Node head = null;
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stack2 NewObj = new Stack2();
		NewObj.push(70);
		NewObj.push(30);
		NewObj.push(56);
		System.out.println("The Top Element is : " + NewObj.peak());

		NewObj.pop();
		NewObj.pop();
		NewObj.pop();

		if (NewObj.isEmpty()) {
			System.out.print("The Stack is Empty");
		} else {
			System.out.print("The Stack is Not Empty");
		}
	}

}
