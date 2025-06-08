import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		String s=  sc.nextLine();
		String[] words= s.split(" ");
		StringBuilder res= new StringBuilder();
		for(String word:words){
		    if(!word.isEmpty()){
		        res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		    }
		}
		System.out.println(res);
	}
}
