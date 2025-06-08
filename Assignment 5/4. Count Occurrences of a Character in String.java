import java.util.*;
public class Main
{
    static int countoccurance(String s, char ch,int index){
        if(index==s.length()) return 0;
        int count = (s.charAt(index)== ch) ?1:0;
        return count+(countoccurance(s,ch,index+1));
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		char ch=  sc.next().charAt(0);
		System.out.print(countoccurance(s,ch,0));
	}
}
