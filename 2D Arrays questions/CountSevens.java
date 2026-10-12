
public class CountSevens {

    public static int SevenCounts(int[][] matrix, int target) {

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{4, 7, 8}, {8, 8, 7,7}, {7, 7, 7, 7}};
        int target = 7;

        int count = SevenCounts(matrix, 7);
        System.out.println("The number of 7's in the matrix is: " + count);
    }
}
