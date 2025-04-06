
import java.util.*;
public class prac25 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("nipun");
        l1.add("nakshu");
        l1.add("prathul");
        System.out.println(l1);
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("prey");
        l2.add("nirjhar");
        l2.add("rat");
        System.out.println(l2);

        ArrayList<String> cl = new ArrayList<>();
        for (String i:l1) {
            cl.add(i);
        }

        for (String i:l2) {
            cl.add(i);
        }

        System.out.println(cl);
    }
}


