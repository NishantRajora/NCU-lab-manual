class doublylinkedlist18 {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head = null;

    public Node addf(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return head;

    }

    public void adde(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void deletef() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void deletee() {
        if (head == null) {
            System.out.println("List empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            if (temp.prev != null) {
                temp.prev.next = null;
            } else {
                head = null;
            }
        }
    }

    public void displaylist() {
        if (head == null) {
            System.out.println("List empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data );
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void reverseList() {
        Node current = head;
        Node temp = null;
        

       
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev; 
        }
    }

    public static void main(String[] args) {
        doublylinkedlist18 dll = new doublylinkedlist18();

        dll.addf(10);
        dll.addf(20);
        dll.adde(30);
        dll.adde(40);

        dll.displaylist(); 

        //dll.deletef();
        //dll.deletee();
        //dll.displaylist(); 

        dll.reverseList();
        dll.displaylist(); 
    }

    
}
