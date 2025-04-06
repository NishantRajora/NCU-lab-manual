
//Write a program to implement stack using arrays and linked lists.

public class ex7 {

    // Stack implementation using Arrays in Java
    public static class StackArray {
        private final int[] arr;
        private int top;
        private final int capacity;

        // Constructor to initialize stack
        public StackArray(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push elements into the stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
            System.out.println("Inserted: " + x);
        }

        // Pop elements from the stack
        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return;
            }
            top--;
        }

        // Peek top element
        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if the stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

    }

    // Stack implementation using Linked List in Java
    public static class StackLinkedList {

        // Node class to represent each element in the stack
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top;

        // Constructor to initialize stack
        public StackLinkedList() {
            top = null;
        }

        // Push elements into the stack
        public void push(int data) {
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
            System.out.println("Inserted: " + data);
        }

        // Pop elements from the stack
        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
            } else {
                top = top.next;
            }
        }

        // Peek top element
        public int peek() {
            if (!isEmpty()) {
                return top.data;
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

    }


    // Main method to test the stack implementation
    public static void main(String[] args) {
        // Using Arrays
        System.out.println("Stack using arrays: ");
        StackArray stack = new StackArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        System.out.println("Top element after pop is: " + stack.peek());

        System.out.println("Stack empty? " + stack.isEmpty());

        // Using Linked List
        System.out.println();
        System.out.println("Stack using Linked List: ");
        StackLinkedList stack2 = new StackLinkedList();

        stack2.push(5);
        stack2.push(6);
        stack2.push(7);

        System.out.println("Top element is: " + stack2.peek());

        stack2.pop();
        System.out.println("Top element after pop is: " + stack2.peek());

        System.out.println("Stack empty? " + stack2.isEmpty());
    }

}