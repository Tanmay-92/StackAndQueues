package StackAndQueuesProblems;

public class MainQueue2 {

	public static void main(String[] args) {
		System.out.println("Creating  Queue");
		
		Queue2 NewObj = new Queue2();
		NewObj.InQueue(56);
		NewObj.InQueue(30);
		NewObj.InQueue(70);
		System.out.println("Inqueue lists ");
		NewObj.Show();
		System.out.println("\n");
		NewObj.DeQueue();
		NewObj.DeQueue();
		NewObj.DeQueue();
		System.out.println("Dequeue lists ");
		NewObj.Show();
	}
}
