package com.assignment4;
import java.util.*;
class Main
{
    static Boolean checkPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		if(checkPalindrome(s)){
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not Palindrome");
		}
	}
}