
public class reverse {
    public static void main(String[] args) {
        String str = "hellow ";
        Stack s1 = new Stack();
        for (int i = 0; i < str.lenght(); i++) {
            s1.Push(str,charAt(i));
            
        }

        while (s1.isEmpty() != true){
            System.out.println(s1.pop());
        }
        Stack s = new Stack();
    }


    
}
