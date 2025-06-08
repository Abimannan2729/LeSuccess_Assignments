public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat")); // Output: true
        System.out.println(isRotation("hello", "lohel"));             // Output: true
        System.out.println(isRotation("abc", "acb"));                 // Output: false
    }
}
