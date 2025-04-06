import java.util.Arrays;
import java.util.Scanner;

/*3	Write a program to read numbers in an integer array of size 5 and display the following:
•	Sum of all the elements
•	Sum of alternate elements in the array
•	Second highest element in the array
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers ");
        int allsum = 0;
        int altsum = 0;
        //sum of all
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the "+(i+1)+"th number: ");
            arr[i] = Integer.parseInt(sc.next());
            allsum += arr[i];
        }
        //sum of alternate
        for (int i = 0; i < 5; i++) {
            if (i%2 ==0){
                altsum += arr[i];
            }
        }
        Arrays.sort(arr);
        int secondhighest = arr[arr.length-2];
        System.out.println();
        System.out.println("The sum of all the numbers is: "+allsum);
        System.out.println("The sum of all alternate numbers is: "+altsum);
        System.out.println("The second highest number is: "+secondhighest);
    }

}
