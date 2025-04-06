public class CircularQueue 
{
    
    int _Front;
    int _Rear;
    int _MaxSize;
    int [] _Data;
    int _ElementCount;

    CircularQueue(int s)
    {
        _MaxSize = s;
        _Data = new int[_MaxSize];
        _Front = 0;
        _Rear = 0;
        _ElementCount = 0;
    }

    public void Enqueue(int data)
    {
        if(_ElementCount == _MaxSize)
        {
            System.out.println("Queue full");
            return;
        }
        _Data[_Rear] = data;
        if(_Rear == _MaxSize - 1)
        {
            _Rear = 0;
        }
        else
        {
            _Rear++;
        }
        _ElementCount++;
    }

    public int Dequeue()
    {
        if(_ElementCount == 0)
        {
            System.out.println("Queue empty");
            return -1;
        }

        int val = _Data[_Front];
        if(_Front == _MaxSize - 1)
        {
            _Front = 0;
        }
        else
        {
            _Front++;
        }
        _ElementCount--;
        return val;
    }

    public int Front()
    {
        return _Data[_Front];
    }
}
