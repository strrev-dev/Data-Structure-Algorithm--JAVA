
import java.util.*;

public class PrimeinRange {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        } else if (n == 2) {
            return true; // 2 is prime
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printPrimesInRange(int start, int n) {
        for (int i = start; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println(); // Move to the next line after printing all primes
    }

    public static void main(String[] args) {

        Scanner prime = new Scanner(System.in);
        System.out.println("Enter the starting number of the range: ");
        int start = prime.nextInt();
        System.out.println("Enter the ending number of the range: ");
        int n = prime.nextInt();

        System.out.println("Prime numbers in the range " + start + " to " + n + ":");
        printPrimesInRange(start, n);

    }
}
