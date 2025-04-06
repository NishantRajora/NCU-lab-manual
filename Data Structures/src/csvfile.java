
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;



public class csvfile {

    
    public static void main(String[] args) {
        int max_row = 0;
        int max_col = 0;
        

        try {
            File file = new File("D:\\Java\\DSAex\\src\\sample.csv"); 
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(",");

                int row = Integer.parseInt(values[0].trim());
                int col = Integer.parseInt(values[1].trim());

                if (row > max_row) max_row = row;
                if (col > max_col) max_col = col;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        int[][] matrix = new int[max_row][max_col];
        

        try {
            File file = new File("D:\\Java\\DSAex\\src\\sample.csv"); 
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(",");

                int row = Integer.parseInt(values[0].trim())-1;
                int col = Integer.parseInt(values[1].trim())-1;
                int data = Integer.parseInt(values[2].trim());

                matrix[row][col] = data;
                

            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        }
        //System.out.println(max_row);
        //System.out.println(max_col);

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");

            }
            System.out.println();
        }


        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[max_row];

        for (int i = 0; i < max_row; i++) {
            if (!visited[i]) {
                s.push(i);
                visited[i] =true;
        
                while (!s.isEmpty()) {
                    int node = s.pop();
                    System.out.print((node + 1) + " "); 

                    for (int j = 0; j < matrix[node].length; j++) {
                        if (matrix[node][j] != 0 && !visited[j]) {
                            s.push(j);
                            visited[j] = true;
                        }
                    }
                }
            }      
        }    
    }
}
