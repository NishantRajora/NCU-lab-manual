
class DNode
{
    public int _data;
    public DNode _next;
    public DNode _prev;

    // Ctor
    DNode(int data)
    {
        _data = data;
        _next = null;
        _prev = null;
    }
}

class DoublyLinkedList
{
    public DNode _head;

    DNode AppendNode(int data)
    {        
        DNode n = new DNode(data);
        
        // Creating first node;
        if(_head == null)
        {
            _head = n;
        }
        else    // Creating node but first;
        {
            DNode temp = _head;
            while(temp._next != null)
            {
                temp = temp._next;
            }
            temp._next = n;
            n._prev = temp;
        }
        return _head;
    }

    // Deletes node if value matches
    DNode DeleteNode(int value)
    {
        DNode temp = _head;

        // If deleting first Node;
        // Remember that this could be the only node in the list
        if(temp._data == value)
        {
            _head = _head._next;    // head reached next node
            temp._next = null;      // Set first node and its next to null
            temp = null;
            return _head;
        }

        // do for rest of the nodes;
        // This is doing two things,
        // Checking if next node exist and then checking its value
        // You cannot check value because if next node does not exist
        // program will crash.
        while(temp._next != null 
            && temp._next._data != value)
        {
            temp = temp._next;
        }

        // in case we reached the last node and didn't find a value
        if(temp._next == null)
        {
            return _head;
        }

        // We reached a node before the value and
        // put a temp2 on next node and null all references
        // return _head
        if(temp._next._data == value)
        {
            DNode temp2 = temp._next;

            // Check if there is a node to make connection
            if(temp._next._next != null)
            {
                // Correct next and prev nodes.
                // Do a dry run to see what is happening.
                temp._next = temp._next._next;
                temp._next._prev = temp;
            }
            else
            {
                temp._next = null;
            }
            
            // Set the node to be deleted to null
            // as well as its references.
            temp2._prev = null;
            temp2 = null;
            return _head;
        }

        // We will probably never reach here
        // We have all the conditions above, code will not come here.
        return _head;
    }

}
