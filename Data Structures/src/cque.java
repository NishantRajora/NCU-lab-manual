public class cque {
    int Front;
    int Rear;
    int MaxSize;
    int[] Data;
    int ElementCount;


    cque(int s) {
        MaxSize = s;
        Front = 0;
        Rear = 0;
        Data = new int[MaxSize];
        ElementCount = 0;
    }

    public void Enqueue(int s) {
        if (ElementCount == MaxSize) {
            System.out.println("queue is full ");
            return;
        }
        Data[Rear] = s; 
        if (Rear == MaxSize - 1) {
            Rear = 0; 
        } else {
            Rear++;
        }
        ElementCount++; 
    }

    
    public int Dequeue() {
        if (ElementCount == 0) {
            System.out.println("queue is empty ");
            return -1; 
        }
        int val = Data[Front];
        if (Front == MaxSize - 1) {
            Front = 0; 
        } else {
            Front++;
        }
        ElementCount--; 
        return val; 
    }

    
    public static void main(String[] args) {
        cque q = new cque(5);

        
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

     
        q.Enqueue(60); 

        System.out.println( q.Dequeue());
        System.out.println( q.Dequeue());
        
        q.Enqueue(60);
        q.Enqueue(70);
        
        while (q.ElementCount > 0) {
            System.out.println( q.Dequeue());
        }

        q.Dequeue(); 
    }
}
