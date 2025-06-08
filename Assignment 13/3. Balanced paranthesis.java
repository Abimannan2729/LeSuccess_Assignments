import java.util.*;

public class Main{
    public static boolean isValid(String s) {

        if (s.length() <= 1) return false;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

      
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                
                if (st.isEmpty()) return false;

                char top = st.peek();
                st.pop();

                // Check for mismatched brackets
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        if(isValid(s)){
            System.out.print("Balanced");
        }
        else{
            System.out.print("Not Balanced");
        }
    }
}
