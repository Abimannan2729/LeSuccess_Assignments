import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        long n = scanner.nextLong();

        long countOfAInS = 0;

        // Count number of 'a' in the original string s
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countOfAInS++;
            }
        }

        long lengthOfS = s.length();

        // Calculate how many full repeats of s are within n characters
        long fullRepeats = n / lengthOfS;
        long remainder = n % lengthOfS;

        // Total 'a's from full repeats
        long totalA = fullRepeats * countOfAInS;

        // Count 'a' in the remaining substring
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalA++;
            }
        }

        System.out.println(totalA);
    }
}
