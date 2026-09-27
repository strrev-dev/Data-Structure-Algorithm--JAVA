
import java.util.Scanner;

public class Create2dArray {

    public static void matrices2dArray(int matrix[][], int n, int m, Scanner sc) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
               
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Enter the elements of the matrix : ");
        Scanner sc = new Scanner(System.in);
        matrices2dArray(matrix, n, m, sc);
    }
}
