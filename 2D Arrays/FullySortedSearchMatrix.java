
public class FullySortedSearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;
            int midvalue = matrix[row][col];
            if (midvalue == target) {
                return true;
            } else if (midvalue < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println("Searching for 7: " + searchMatrix(matrix, 7));// true
        System.out.println("Searching for 23: " + searchMatrix(matrix, 23));//
    }
}
