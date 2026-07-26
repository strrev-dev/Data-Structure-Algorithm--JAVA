
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to Print the Multiplication table : ");
        int number = scan.nextInt();
        System.out.println("Multiplication table of " + number + " is : ");
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scan.close();
    }
}
