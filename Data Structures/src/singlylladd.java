public class singlylladd {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
 
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        if (position == 1) {
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertAfterValue(int targetValue, int data) {
        
        Node newNode = new Node(data);
    
        
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
    
        Node temp = head;
        while (temp != null && temp.data != targetValue) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position not available");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }   
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        singlylladd s = new singlylladd();
        s.insertAtPosition(1, 1);
        s.insertAtPosition(2, 2);
        s.insertAtPosition(3, 3);
        s.displayList();
        s.insertAfterValue(1, 4);
        s.displayList();

    }
}
