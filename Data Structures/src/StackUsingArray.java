import java.util.Scanner;
// ex7 p1
/*Write a program to create a stack and perform:
•	POP
•	PUSH
•	PEEK
•	ISEMPTY
•	ISFULL
 */
class StackArray {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println();
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println();
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        StackArray stack = new StackArray(size);

        // Sample operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Top element " + stack.peek());
        System.out.println("stack empty? " + stack.isEmpty());
        System.out.println("stack full? " + stack.isFull());
    }
}
