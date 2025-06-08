import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();
        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0);
        
        float sumFloat = (float) intValue + floatValue;
        int asciiSum = intValue + (int) charValue;
        
        System.out.println("Sum of integer (converted to float) and float = " + sumFloat);
        System.out.println("Sum of integer and ASCII value of character '" + charValue + "' = " + asciiSum);
    }
}
