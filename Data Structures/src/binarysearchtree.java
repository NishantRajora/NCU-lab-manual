
import java.lang.classfile.components.ClassPrinter;


public class binarysearchtree{
    class  TNode{
        int value;
        TNode left;
        TNode right;


        public TNode(int value) {
            this.value =value;
            this.left =null;
            this.right =null;

        }   
    }
    private TNode root = null;
    public int ncount =0;
    public int pcount =0;

    public void insert(int value){
        TNode n = new TNode(value);
        if (root == null){
            root = n;
            ncount+=1;
            return;
        }

        else{
            TNode temp = root;
            while (true) { 

                if (value <= temp.value){
                    if (temp.left == null){
                        temp.left = n;
                        ncount+=1;
                        break;
                    }
                    else{
                        temp= temp.left;
                    }
                }
                else {
                    if (temp.right == null){
                        temp.right = n;
                        ncount+=1;
                        break;
                    }
                    else{
                        temp= temp.right;
                    }
                }
            }
        }

    }
    public void show(TNode n){
        
        if (n == null){
            return;
            

        }
        show(n.left);
        System.out.println(n.value);
        pcount++;
        show(n.right);

        //System.out.println(n.right);
    }
    public void count(){
        System.out.println(ncount);
        System.out.println(pcount);

    }
    public int height(TNode n){
        if (n == null){
            return 0;   
        }
        int lh =height(n.left);
        int rh =height(n.right);


    }

   
    public static void main(String[] args) {
        binarysearchtree b = new binarysearchtree();
        b.insert(11);
        b.insert(10);
        b.insert(3);
        b.insert(4);
        b.insert(9);
        b.insert(22);
        b.insert(45);
        b.insert(21);
        b.insert(28);
        b.insert(29);
        b.insert(28);
        b.show(b.root);
        b.count();

        

    }
}