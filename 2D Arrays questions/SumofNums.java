
public class SumofNums {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        int rowIndex = 1;
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            sum += matrix[rowIndex][j];
        }

        System.out.println("The sum of the elements in second row Index number  " + rowIndex + " is: " + sum);
    }
}
