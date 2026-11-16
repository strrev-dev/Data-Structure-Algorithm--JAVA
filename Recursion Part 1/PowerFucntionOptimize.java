import java.util.Scanner;

public class PowerFucntionOptimize {
    public static int printPoweroptimized(int x, int n) {
        // Safety guard for negative exponents
        if (n < 0) {
            System.out.println("Negative exponents require decimal (double) return types.");
            return -1;
        }

        // Base Case: Anything to the power of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive Step fucntion
        int Halfpower = printPoweroptimized(x, n / 2);
        // for even power
        int Fullpower = Halfpower * Halfpower;
        // odd power
        if (n % 2 != 0) {
            Fullpower = Fullpower * x;
        }
        return Fullpower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = printPoweroptimized(x, n);
        if (n >= 0) {
            System.out.println(x + " to the power " + n + " is: " + result);
        }

        sc.close();
    }
}
