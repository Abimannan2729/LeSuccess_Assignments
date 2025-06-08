import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark>=90 && mark<=100) System.out.print("Grade A");
		else if(mark>=75 && mark<=89) System.out.print("Grade B");
		else if(mark>=60 && mark<=74) System.out.print("Grade C");
		else if(mark>=40 && mark<=59) System.out.print("Grade D");
		else System.out.print("Fail");
	}
}
