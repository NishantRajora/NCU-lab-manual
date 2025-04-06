import java.util.Stack;

public class nit2 {
    public static void main(String[] args) {
        String s = "{[]}(){{}}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If it's an opening bracket, push it onto the stack
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            
            // If it's a closing bracket
            else if (c == '}' || c == ')' || c == ']') {
                // Check if stack is empty or if the top of the stack doesn't match
                if (stack.isEmpty()) {
                    System.out.println("Incorrect arrangement of braces");
                    return;
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '[')) {
                    System.out.println("Incorrect arrangement of braces");
                    return;
                }
            } else {
                System.out.println("Incorrect characters");
                return;
            }
        }

        // After the loop, the stack should be empty if all brackets are balanced
        if (stack.isEmpty()) {
            System.out.println("Correct arrangement of braces");
        } else {
            System.out.println("Incorrect arrangement of braces");
        }
    }
}
