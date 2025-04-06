class LL {
    Node head;
    private  int size;

    LL() {
        this.size=0;
    }

    

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addf(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void addl(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        size++;

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    
    public void delf(){
        if (head == null ){
            System.out.println("List is empty");
            return;

        }
        size--;
        head = head.next;

    }

    public void dell(){
        if (head == null ){
            System.out.println("List is empty");
            return;

        }
        size--;
        if (head.next== null){
            head = null;
            return;
        }
        Node secondlast  = head;
        Node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;

        }

        secondlast.next = null;

    }


    public void printl() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public int getSize(){
        return  size;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        LL list = new LL();
        list.addf("a");
        list.addf("aa");

        list.printl();

        list.addl("asa");
        list.printl();

        list.delf();
        list.printl();

        list.dell();
        list.printl();

        System.out.println(list.getSize());

        list.addf("fdes");
        System.out.println(list.getSize());
        
    }
}
