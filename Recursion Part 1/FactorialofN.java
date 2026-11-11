import java.util.*;

public class FactorialofN {
    public static int printfactorial(int n) {
// for negative number
        if (n < 0) {
            System.out.print("Entered number is negative  Factorial of negative number dont exist, please enter +ve Integer");
            return -1;
        }
        if (n == 0) {
            return 1;
        }
//        int factorial = printfactorial(n - 1);
        int fact = n * printfactorial(n - 1);
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the factorial value n : ");
        int n = sc.nextInt();
        System.out.print(printfactorial(n));
        sc.close();
    }
}
