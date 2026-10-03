
public class DiagonalSum {

    public static int diagonalMatrixSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += matrix[i][i];

            // Add secondary diagonal element
            sum += matrix[i][n - 1 - i];
        }

        // If n is odd, the exact center element was added twice, so subtract it once
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] evenMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] oddMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Passing the specific matrix variables correctly
        System.out.println("Even matrix diagonal sum: " + diagonalMatrixSum(evenMatrix)); // 68
        System.out.println("Odd matrix diagonal sum: " + diagonalMatrixSum(oddMatrix));   // 25
    }
}
