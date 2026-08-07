
import java.util.Scanner;

public class ProductofAandB {

    public static int multiplication(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first numbers to find the product: ");
        int a = scan.nextInt();
        System.out.println("Enter Second number to find the product: ");
        int b = scan.nextInt();
        int result = multiplication(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);
        scan.close();
    }
}
