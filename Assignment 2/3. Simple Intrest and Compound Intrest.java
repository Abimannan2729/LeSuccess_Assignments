import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display options

        // Input principal, rate, and time
        System.out.print("Enter Principal : ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double interest;
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + interest);
        } else if (choice == 2) {
            interest = principal * Math.pow((1 + rate / 100), time) - principal;
            System.out.println("Compound Interest = " + interest);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
