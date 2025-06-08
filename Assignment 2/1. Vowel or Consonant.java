import java.util.*;
public class Main
{
    static Boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		if(vowel(ch)){
		    System.out.print("Vowel");
		}
		else{
		    System.out.print("Consonant");
		}
	}
}
