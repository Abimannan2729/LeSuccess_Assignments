import java.util.*;
public class Main {
	public static void reverseFirstKelements(Queue<Integer> q,int k) {
		if(q.isEmpty()) return;
		if(k<0 || k> q.size()) {
			System.out.println ("Invalid K value");
			return ;
		}
		int n= q.size();
		Stack<Integer> s= new Stack();
		for(int i=0; i<k; i++) {
			s.push(q.poll());
		}
		while(!s.isEmpty()) {
			q.offer(s.pop());
		}
		for(int i=0; i<n-k; i++) {
			q.offer(q.poll());
		}
	}



	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		int k=6;
		reverseFirstKelements(queue,k);
		if (k >= 0 && k <= queue.size()) {
			System.out.println(queue);
		}
	}
}
// q= 1 2 3 4 5   s={}
// s=1 2 3   q= 4 5
// s={} q= 3 2 1 4 5
// s= 4 5 q={ 3 2 1}
// s={} q= 3 2 1 4 5