//Question 3: Write a program to find the factorial of a number 
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number  to find the facatorial : ");
        double number= scan.nextInt();
        double fact = 1;
        for (double i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is : " + fact);
        scan.close();
    }
}
