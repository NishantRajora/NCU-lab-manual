
class Node
{
    public int _data;
    public Node _next;
}

class SinglyLinkedList
{
    public Node _head;


    Node AppendNode(int data)
    {        
        Node n = new Node();
        n._data = data;
        n._next = null;
        
        if(_head == null)
        {
            _head = n;
        }
        else
        {
            Node temp = _head;
            while(temp._next != null)
            {
                temp = temp._next;
            }
            temp._next = n;
        }
        return _head;
    }

    boolean DeleteLast()
    {
        if(_head == null)
        {
            return true;
        }

        if(_head._next == null)
        {
            _head = null;
        }
        else
        {
            Node current = _head._next;
            Node prev = _head;
            while(current._next != null)
            {
                prev = current;
                current = current._next;
            }
            current = null;
            prev._next = null;            
        }
           

           return true;
    }

    void PrintNodes()
    {
        if(_head == null)
        {
            return;
        }

        Node current = _head;
        System.out.println(_head._data);
        while(current._next != null)
        {
            current = current._next;
            System.out.println(current._data);
        }
    }
}
