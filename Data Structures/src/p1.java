class DLL {
    Node head;
    Node tail;
    int length;

    // Node class
    class Node {
        String data;
        Node next;
        Node prev;

        // Constructor for Node
        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Constructor for DLL
    DLL() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    // Reverse method to print the list in reverse order
    void reverse() {
        if (tail == null) {
            return;
        } else {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.prev;
            }
            System.out.println("Null");
        }
    }

    // Add a node to the end of the list
    void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
}

public class p1 {
    public static void main(String[] args) {
        DLL list = new DLL();

        // Add some data to the list
        list.append("Node1");
        list.append("Node2");
        list.append("Node3");

        // Print the list in reverse
        list.reverse();
    }
}
