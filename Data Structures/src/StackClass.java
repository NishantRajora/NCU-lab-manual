import java.util.*;

public class StackClass {
    /*static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;

        public static boolean isempty(){
            return head == null;

        }
        public static void push(int data){
            Node newnode = new Node(data);
            if (isempty()){
                head = newnode;
                return;
            }
            newnode.next =head;
            head = newnode;

        }
        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return  top;

        }
        
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }

    }*/



    /*static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();
       public static boolean isempty() {
           return list.size()== 0;
       }

       public static void push(int data){
           list.add(data);

       }
       public static int pop(){
           if (isempty()){
               return -1;
           }
           int top = list.get(list.size()-1);
           list.remove(list.size()-1);
           return top;
       }
       public static int peek(){
           if (isempty()){
               return -1;
           }
           return list.get(list.size()-1);

       }
    }
       */


    public static void main(String[] args){
        //Stack s = new Stack();
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }

    }
}
