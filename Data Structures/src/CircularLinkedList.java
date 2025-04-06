
//Write a program to create a circular linked list of n nodes and perform:
//•	Insertion
//At the beginning
//At the end
//At a specific location
//•	Deletion
//At the beginning
//At the end
//At a specific location

// Circular Linked List implementation in Java
class CircularLinkedList {

    // Node class to represent each element in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the circular linked list
    private Node head = null;
    private Node tail = null;

    // Insert node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;  
        }
    }

    // Insert node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  
        }
    }

    // Insert node at a specific location
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
            if (current == tail) {
                tail = newNode;
                tail.next = head;
            }
        } else {
            System.out.println("Position out of bounds");
        }
    }

    // Delete node at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    // Delete node at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = head;
        }
    }

    // Delete node at a specific location
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            if (current.next == tail) {
                tail = current;
                tail.next = head;
            } else {
                current.next = current.next.next;
            }
        } else {
            System.out.println("Position out of bounds");
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Main function to test the circular linked list
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtPosition(4, 2);

        System.out.println("Circular Linked List after insertion:");
        list.display();

        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(2);

        System.out.println("Circular Linked List after deletion:");
        list.display();
    }
}