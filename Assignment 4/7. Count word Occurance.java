import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String word= sc.nextLine();
		String[] words= s.split(" ");
		int count=0;
		for(String w:words){
		    if(w.contains(word)) count++;
		}
		System.out.println(count);
	}
}
