import java.util.*;
public class Main
{
    static int countdigit(int n){
        if(n<10) return 1;
        return 1+countdigit(n/10);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print("The number of digits in "+n+" is:"+countdigit(n));
	}
}