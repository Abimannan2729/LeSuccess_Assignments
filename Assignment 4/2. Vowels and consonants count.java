import java.util.*;
public class Main
{
	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();
       int Vowel_count=0;
       int consonant_count=0;
       s=s.toLowerCase();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(Character.isLetter(ch)){
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') Vowel_count++;
           else consonant_count++;
       }
       }
       System.out.println("Vowels: "+Vowel_count+","+" consonant: "+consonant_count);
	}
}
