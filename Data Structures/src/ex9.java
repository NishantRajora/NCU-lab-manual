// Write a program to check for balanced parenthesis in a given expression.
import java.util.Stack;

public class ex9 {
    // Method to check if parentheses are balanced
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse through the expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // For closing brackets, check if they match the top of the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop();

                // Check if the closing bracket matches the corresponding opening one
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were properly matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{[()]}";

        if (areParenthesesBalanced(expression)) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has unbalanced parentheses.");
        }
    }
}