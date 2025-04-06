public class Stack {

    private int [] _Data;
    private int _Top;
    private int _StackSize;

    public Stack()
    {
        _Top = -1;
        _StackSize = 10;
        _Data = new int[_StackSize];
    }
    
    // Returns the value of _Top
    public int Push(int d)
    {
        // Check for overflow
        if(_Top == _StackSize - 1)
        {
            System.out.println("Stack overflow");
            return _Top;
        }

        _Data[++_Top] = d;
        return _Top;
    }

    // Returns the popped element
    public int pop()
    {

        // Check for underflow
        if(_Top == -1)
        {
            System.out.println("Stack underflow");
            return -1;
        }

        _Top--;
        return _Data[_Top+1];
    }

    // returns top, 1 based index.
    public int Top()
    {
        return _Top + 1;
    }
}

