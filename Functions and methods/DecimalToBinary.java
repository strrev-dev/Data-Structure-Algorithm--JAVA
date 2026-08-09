import java.util.*;

public class DecimalToBinary {

    // Method to convert decimal to binary
    public static int DTBC(int n) {
        if (n == 0) {
            return 0;
        }

        int binary = 0;
        int power = 0;

        while (n > 0) {
         int remainder = n%2;
            binary += remainder* (int)Math.pow(10,power);
            n /= 2;
            power++;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            return;
        }

        int decimal = sc.nextInt();
         DTBC(decimal);
        System.out.println("The binary number of " + decimal + " is: " + DTBC(decimal));

        sc.close();
    }
}

       