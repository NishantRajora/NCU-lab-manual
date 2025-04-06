import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element is " + max);
        System.out.println("The minimum element is " + min);
        System.out.println("The difference between maximum and minimum elements is " + Math.abs(max - min));
    }

}
