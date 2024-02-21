import java.util.*;
//--------Reverse String In TO Stack------
public class Stack4 {


      //Methode
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        } 
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str= "aman";
        
        String result = reverseString(str); // store the result in result
        System.out.println(result);
    }
}
