import java.util.*;
public class nit {
    public static void main(String[]args){
        String s="{[]}(){{}}";
       Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<s.length()-1;i++){
           char c=s.charAt(i);
           if(c=='{'||c=='('||c=='['){
               stack.push(c);
           }
           else if(c=='}'||c==')'||c==']'){
               if(stack.pop()!='{'&&c=='}'){
                   System.out.println("Incorrect arrangement of braces");
               }
               else if(stack.pop()!='('&& c ==')'){
                   System.out.println("Incorrect arrangement of braces");
               }
               else{
                   if(stack.pop()!='['){
                       System.out.println("Incorrect arrangement of braces");
                   }
               }
               //else{
               //   System.out.println("Incorrect characters");
               //}
           }
       }
       

    }
    
}
