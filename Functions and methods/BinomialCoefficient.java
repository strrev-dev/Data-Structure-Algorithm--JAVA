
import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n, int r) {
        int fact1 = 1;
        int fact2 = 1;
        int fact3 = 1;

        for (int i = 1; i <= n; i++) {
            fact1 = fact1 * i;
        }
        for (int j = 1; j <= r; j++) {
            fact2 = fact2 * j;
        }
        for (int k = 1; k <= (n - r); k++) {
            fact3 = fact3 * k;
        }

        return fact1 / (fact2 * fact3);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scan.nextInt();
        System.out.println("Enter the value of r : ");
        int r = scan.nextInt();
        if (n < r) {
            System.out.println("n should be greater than or equal to r");

        } else {

            int result = factorial(n, r);
            System.out.println("The binomial coefficient of " + n + " and " + r + " is: " + result);
        }
        scan.close();
    }
}
