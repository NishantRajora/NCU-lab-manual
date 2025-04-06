public class DoublyEndedQueue {
    int Front;
    int Rear;
    int MaxSize;
    int[] Data;
    int ElementCount;

    DoublyEndedQueue(int s) {
        MaxSize = s;
        Front = 0;
        Rear = -1;
        Data = new int[MaxSize];
        ElementCount = 0;
    }

    public void Addfront(int s) {
        if (ElementCount == MaxSize) {
            System.out.println("Queue is full");
            return;
        }
        // Move Front backward in circular manner
        Front = (Front - 1 + MaxSize) % MaxSize;
        Data[Front] = s;
        ElementCount++;
    }

    public void Addrear(int s) {
        if (ElementCount == MaxSize) {
            System.out.println("Queue is full");
            return;
        }
        // Move Rear forward in circular manner
        Rear = (Rear + 1) % MaxSize;
        Data[Rear] = s;
        ElementCount++;
    }

    public int Remfront() {
        if (ElementCount == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = Data[Front];
        // Move Front forward in circular manner
        Front = (Front + 1) % MaxSize;
        ElementCount--;
        return val;
    }

    public int Remrear() {
        if (ElementCount == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = Data[Rear];
        // Move Rear backward in circular manner
        Rear = (Rear - 1 + MaxSize) % MaxSize;
        ElementCount--;
        return val;
    }

    public static void main(String[] args) {
        DoublyEndedQueue s = new DoublyEndedQueue(5);
        s.Addfront(10);
        s.Addrear(20);
        s.Addfront(5);
        System.out.println("Removed from front: " + s.Remfront());
        System.out.println("Removed from rear: " + s.Remrear());
    }
}
