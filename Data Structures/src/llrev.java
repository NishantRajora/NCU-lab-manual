import java.util.Stack;

public class llrev {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void rever() {
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        head = stack.pop();
        temp = head;
        
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        temp.next = null;
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
        llrev s = new llrev();
        s.append(1);
        s.append(2);
        s.append(3);
        s.displayList();
        s.rever();

        s.displayList();



    }
}
