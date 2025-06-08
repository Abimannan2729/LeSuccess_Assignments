import java.util.*;
public class Main
{
	static Boolean anagrams(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		int freq[]= new int[26];
		char[] arr1= s1.toCharArray();
		char[] arr2= s2.toCharArray();
		for(int i=0; i<s1.length(); i++) {
			freq[arr1[i]-'a']++;
            freq[arr2[i]-'a']--;
		}
		for(int c:freq){
		    if(c!=0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		if(anagrams(s1,s2)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}