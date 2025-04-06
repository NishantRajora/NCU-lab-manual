public class QueueY {

    //circular quweue using array
    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear+1) % size == front;

        }

        // Enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Full queue");
                return;
            }
            if (front==-1 ){
                front=0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front){
                rear = front = -1;
            }
            else {
                front  = (front+1) % size;
                
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
