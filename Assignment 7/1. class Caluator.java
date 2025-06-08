import java.util.*;
class Calculator{
    int result;
    static int operationCount=0;
    int add(int a,int b){
        operationCount++;
        return result=a+b;
    }
    static void displayOperationCount() {
        System.out.print(operationCount);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    Calculator add1= new Calculator();
	    Calculator add2= new Calculator();
	    int a = sc.nextInt();
	    int b= sc.nextInt();
	    add1.add(a,b);
	    add2.add(a,b);
	    System.out.println(add1.result);
	    Calculator.displayOperationCount();
	}
}
