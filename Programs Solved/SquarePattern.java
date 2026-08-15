
import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the  value of n : ");
        int n = scan.nextInt();
        if (n >= 2) {

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
                }
                System.out.println();

            }

        } else {
            System.out.println("Invalid Input! Please enter a value greater than or equal to 2.");
        }
        scan.close();

    }
}
