import java.util.*;
class LLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("dd");
        list.addFirst("dd");

        System.out.println(list);

        list.addLast("asss");
        list.add("ddd");
        System.out.println(list);

        System.err.println(list.size());


        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.removeFirst();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);


    }
    
}
