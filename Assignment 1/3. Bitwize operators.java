import java.util.Scanner;

public class BitwiseOperatorExperiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2 ");
        int num2 = sc.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int leftShiftNum1 = num1 << 2;
        int leftShiftNum2 = num2 << 2;
        int rightShiftNum1 = num1 >> 2;
        int rightShiftNum2 = num2 >> 2;

        System.out.println("\nBitwise Operations:");
        System.out.println("AND  = " + andResult);
        System.out.println("OR  = " + orResult);
        System.out.println("XOR  = " + xorResult);
        System.out.println("Left Shift num1 by 2 bits = " + leftShiftNum1);
        System.out.println("Left Shift num2 by 2 bits = " + leftShiftNum2);
        System.out.println("Right Shift num1 by 2 bits = " + rightShiftNum1);
        System.out.println("Right Shift num2 by 2 bits = " + rightShiftNum2);

    }
}
