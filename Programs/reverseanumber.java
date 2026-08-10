import java.util.Scanner;

public class reverseanumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.print("Reversed number: ");

        while (number != 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;
        }

        scan.close();
    }
}