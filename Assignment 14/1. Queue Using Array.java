import java.util.*;
class Queue{
    int[] queue= new int[100];
    int rear=0;
    int front=0;
    
    public void enqueue(int val){
        System.out.println("Element Added to queue: "+ val);
        queue[rear++]= val;
    }
    public int dequeue(){
        System.out.println("Element removed from queue:"+ queue[front]);
        return queue[front++];
    }
    public void display(){
        if(front==rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Elements in Queue are: ");
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		Queue q= new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
	}
}