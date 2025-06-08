import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Set<Integer> duplicates = new HashSet<>();
        boolean hasDuplicates = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
                hasDuplicates = true;
            }
        }
        if (hasDuplicates) {
            for (int val : duplicates) {
                System.out.print(val + " ");
            }
        } else {
            System.out.println("No duplicates");
        }
    }
}
