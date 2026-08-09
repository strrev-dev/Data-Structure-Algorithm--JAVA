import java.util.Scanner;

public class BinaryToDecimal {

    // Method to convert binary to decimal
    public static int bTDC(int n) {
        
        int decimal = 0;
        int power = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            // Validate binary digit
            if (lastDigit != 0 && lastDigit != 1) {
                throw new IllegalArgumentException("Invalid binary number: contains digits other than 0 and 1.");
            }

            decimal += lastDigit * (int) Math.pow(2, power);
            n /= 10;
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a binary number.");
            return;
        }

        int binary = sc.nextInt();
        try {
            int result = bTDC(binary);
            int myNumber = binary;
            System.out.println("The decimal number of " + myNumber + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
