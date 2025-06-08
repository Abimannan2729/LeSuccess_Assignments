import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=  sc.nextLine();
		s= s.toLowerCase();
		boolean seen[] = new boolean[26];
		StringBuilder res= new StringBuilder();
		
		for(char ch: s.toCharArray()){
		    if(!seen[ch-'a']){
		        seen[ch-'a']=  true;
		        res.append(ch);
		    }
		}
		System.out.println(res.toString());
	}
}
