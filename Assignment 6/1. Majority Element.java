import java.util.*;

public class Main {
    public static int findMajorityElement(int[] arr) {
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
            System.out.println(count);
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        System.out.println(findMajorityElement(arr)); // Output: 3
    }
}
