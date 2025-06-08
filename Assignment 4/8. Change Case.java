import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		String s= sc.nextLine();
		StringBuilder res=  new StringBuilder();
		for(char ch:s.toCharArray()){
		    if(Character.isLowerCase(ch)){
		        res.append(Character.toUpperCase(ch));
		    }
		     if(Character.isUpperCase(ch)){
		        res.append(Character.toLowerCase(ch));
		    }
		}
		System.out.println(res);
	}
}
