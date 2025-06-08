import  java.util.*;
public class Main
{
    static long calculatepower(int base,int exp){
        if(exp==0) return 1;
        return base*calculatepower(base,exp-1);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.print("a^b is: "+ calculatepower(a,b));
	}
}
