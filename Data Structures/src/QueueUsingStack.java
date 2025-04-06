public class QueueUsingStack {

    private Stack s1;
    private Stack s2;
    private int currentstack;
    private int currentop;


    public QueueUsingStack() {
        s1 = new Stack();
        s2 = new Stack();
        currentstack = 1;
        currentop= 1;
         // We start by using s1 for enqueue operations
    }
    // Enqueue operation
    public void enqueue(int data) {
        if (currentstack == 1) {
            s1.Push(data);
        } else {
            // If currently using s2, transfer all elements from s2 to s1
            while (s2.Top() != 0) {
                s1.Push(s2.pop());
            }
            s1.Push(data);

            currentstack = 1; // Set currentstack back to 1
        }
    }
    // Dequeue operation
    public int dequeue() {
        if (currentstack == 1) {
            
            while (s1.Top() != 0) {
                s2.Push(s1.pop());
            }
            currentstack = 2; // Set currentstack to 2 for future operations
        }
        // Perform the pop operation on s2
        return s2.pop();
    }
    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue()); 

        queue.enqueue(5);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());




    }
}
