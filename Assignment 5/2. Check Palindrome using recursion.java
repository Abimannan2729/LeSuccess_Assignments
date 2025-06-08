import java.util.*;
public class Main
{
    static Boolean checkPalindrome(StringBuilder s,int left,int right){
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return checkPalindrome(s,left+1,right-1);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder s= new StringBuilder(sc.nextLine());
		if(checkPalindrome(s,0,s.length()-1)) {
			System.out.print("Palindrome");
		}
		else{
		    System.out.print("Not Palindrome");
		}
	}
}
