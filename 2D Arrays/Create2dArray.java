
import java.util.Scanner;

public class Create2dArray {

    public static void findcell(int matrix[][], int n, int m, int key) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("The key is found at the index : (" + i + " " + j + ")");
                    found = true;

                }

            }
        }
        if (!found) {
            System.out.println("The key is not found");

        }

    }

    public static void matrices2dArray(int matrix[][], int n, int m, Scanner sc) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("The elements of the matrix are : ");
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
        int key = 25;
        System.out.println("Enter the elements of the matrix : ");
        Scanner sc = new Scanner(System.in);
        matrices2dArray(matrix, n, m, sc);
        findcell(matrix, n, m, key);
    }
}
