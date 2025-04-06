public class cll {
    public class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next =null;
        }

    }
    private Node head = null;
    private Node tail = null;

    public void AddNode(int data){
        Node newNode =new Node(data);
        if (head == null){
            head =newNode;
            tail = newNode;
            newNode.next = head;
        } 
        else {
            tail.next =newNode;
            tail =newNode;
            tail.next = head;
        }
    } 
    public void DeleteNodeByValue(int value){
        Node temp = head ;
        Node prev =null;
        if (head == null ){
            System.out.println("the list is empty ");
            return;

        }
        else if (head.data == value){
            tail.next = head.next;
            head = head.next;
            return;

        }
        do{
            prev = temp;
            temp = temp.next;
        } 
        while(temp != head && temp.data != value);
        if(temp == head){
            System.out.println("Element not found in the list");
        }
        prev.next = temp.next;
        temp.next = null;
        if(temp == tail){
            tail =prev;
        }



    }

    public void DeleteNodeByPosition(int position) {
        if (head == null || position < 0) {
            return;
        }

        // If the node to be deleted is the head node
        if (position == 0) {
            if (head == tail) { // Only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 0;
        do {
            prev = current;
            current = current.next;
            count++;
            if (count == position) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                return;
            }
        } while (current != head);
    }

    public void printList(){
        if (head == null) {
            System.out.println("the list is empty ");
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();

    }
    public static void main(String[] args) {
        cll list = new cll();
        list.AddNode(10);
        list.AddNode(20);
        list.AddNode(30);
        list.printList();
        list.DeleteNodeByValue(20);
        list.printList();
        list.AddNode(45);
        list.DeleteNodeByValue(2);
        list.printList();


        
        
    }
}
