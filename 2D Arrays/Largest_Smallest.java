
import java.util.Scanner;

public class Largest_Smallest {

    public static void findLargestSmallest(int matrix[][], int n, int m) {
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > Largest) {
                    Largest = matrix[i][j];
                }
                if (matrix[i][j] < Smallest) {
                    Smallest = matrix[i][j];
                }

            }

        }
        System.out.println("The largest element in the matrix is : " + Largest);
        System.out.println("The smallest element in the matrix is : " + Smallest);
    }

    public static void Matrices2dArray(int matrix[][], int n, int m, Scanner sc) {
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
        System.out.println("Enter the elements of the matrix : ");
        Scanner sc = new Scanner(System.in);

        Matrices2dArray(matrix, n, m, sc);
        findLargestSmallest(matrix, n, m);
    }
}
