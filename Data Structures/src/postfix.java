import java.util.ArrayList;

public class postfix {
    public static int ev(String ex) {
        ArrayList<Integer> stack = new ArrayList<>(); 

        for (int i = 0; i < ex.length(); i++) {
            char ch = ex.charAt(i);


            if (Character.isDigit(ch)) {
                //System.out.println(ch);
                //System.out.println((int)ch);
                //System.out.println(ch - '0');
                stack.add(ch - '0');
            }
            else {
                int o2 = stack.remove(stack.size() - 1); 
                int o1 = stack.remove(stack.size() - 1);
                int r = 0;
                switch (ch) {
                    case '+':
                        r = o1 + o2;
                        break;
                    case '-':
                        r = o1 - o2;
                        break;
                    case '*':
                        r = o1 * o2;
                        break;
                    case '/':
                        r = o1 / o2;
                        break;
                    case '%':
                        r = o1 % o2;
                        break;
                    case '^':
                        r = (int) Math.pow(o1, o2);
                        break;
                }
                stack.add(r);
            }
        }
        return stack.remove(stack.size() - 1);
    }

    public static void main(String[] args) {
        String ex = "452^7%32*+63/-82^++";
        int r = ev(ex);
        System.out.println("Result: " + r);
    }
}
