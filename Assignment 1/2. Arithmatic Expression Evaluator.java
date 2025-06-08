import java.util.Scanner;

public class ArithmeticExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a double value: ");
        double doubleVal = sc.nextDouble();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2; 
        } else {
            System.out.println("Division by zero error.");
        }
        double result = sum * doubleVal;
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + diff);
        System.out.println("Multiplication = " + product);
        if (num2 != 0) {
            System.out.println("Division = " + division);
        }
        System.out.println("Sum * double value = " + result);

    }
}
