class Queue {
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data= data;
			this.next=null;
		}
	}
	Node rear=null;
	Node front=null;

	// Adding Queue element
	public void enqueue(int val) {
		Node newnode = new Node(val);
		System.out.println("Element added to Queue: "+ val);
		if(rear==null) {
			rear=newnode;
			front= newnode;
			return;
		}
		rear.next=newnode;
		rear= newnode;
	}

	public void dequeue() {
		if(front==null) {
			System.out.println("Queue is empty");
			return;
		}
        System.out.println("Element removed from Queue: "+ front.data);
		front=front.next;
        if(front==null) rear=null;
	}

	public boolean isEmpty() {
		return front==rear;
	}

	public int size() {
		if(isEmpty()) {
			return 0;
		}
		int size=1;
		Node temp=front;
		while(temp!=rear) {
			size++;
			temp=temp.next;
		}
		System.out.print("Queue size: ");
		return size;
	}
	public int getFront() {
		if(isEmpty()) {
		System.out.println("Queue is empty");
		return -1;
		}
        System.out.print("Queue front: ");
         return front.data;
	}
		public int getRear() {
		if(isEmpty()) {
		System.out.println("Queue is empty");
		return -1;
		}
         System.out.print("Queue rear: ");
         return rear.data;
	}
}
public class Main
{
	public static void main(String[] args) {
		Queue queue= new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println(queue.getRear());
		System.out.println(queue.getFront());
		System.out.println(queue.size());
	    queue.dequeue();
		queue.enqueue(70);
		queue.enqueue(80);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.getRear());
		System.out.println(queue.getFront());

	}
}
