
import java.util.Stack;
// reverse a string 
public class rev {
    public static String reverseSentence(String sentence) {
        Stack<String> stack = new Stack<>();
        String[] words = sentence.split(" "); // Split the sentence into words

        // Push all words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop the words from the stack to reverse their order
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        return reversedSentence.toString().trim(); // Remove the trailing space
    }

    public static void main(String[] args) {
        String sentence = "Hello World this is a test";
        String reversedSentence = reverseSentence(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}