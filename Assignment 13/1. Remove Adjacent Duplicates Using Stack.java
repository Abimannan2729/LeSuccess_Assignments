import java.util.*;

public class Main{
    
    public static String removeAdj(String s) {
        
        if (s.length() <= 1) return s;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch== st.peek()) st.pop();
            else{
                st.push(ch);
            }
        }
        StringBuilder res= new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.print(removeAdj(s));
    }
}
