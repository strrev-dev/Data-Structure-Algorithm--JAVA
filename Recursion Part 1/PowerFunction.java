import java.util.*;

public class PowerFunction {
    public static int printPower(int x, int n) {
        // Safety guard for negative exponents
        if (n < 0) {
            System.out.println("Negative exponents require decimal (double) return types.");
            return -1;
        }

        // Base Case: Anything to the power of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive Step: Match the exact method name 'printPower'
        int power = x * printPower(x, n - 1);
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = printPower(x, n);
        if (n >= 0) {
            System.out.println(x + " to the power " + n + " is: " + result);
        }

        sc.close();
    }
}