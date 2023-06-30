import java.util.Stack;
import java.util.Scanner;

public class parenthesis_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(isValid(s)==true){
            System.out.println("true");
        }
        System.out.println("false");
    }
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                stack.push(')');
            } else if (ch=='[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            }else if (stack.isEmpty() || stack.pop() != ch)
                return false;
        }
        return stack.isEmpty();
    }
}
