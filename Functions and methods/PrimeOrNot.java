
import java.util.Scanner;


public class PrimeOrNot {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
    

   
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Scanner prime = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not: ");
        int n = prime.nextInt();

        boolean result = isPrime(n);
        System.out.println("The number " + n + " is " + (result  ? "prime." : "not prime."));

    }
}
