//Ques:2 Write a program to find the sum of even and odd numbers in a given set of numbers.

import java.util.Scanner;

public class SumofsetsEvenandOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int SumEven = 0;
        int SumOdd = 0;
        int choice;

        do {
            System.out.print("Enter the Interger number : ");

            number = scan.nextInt();
            if (number % 2 == -0) {
                SumEven += number;

            } else {
                SumOdd += number;
            }
            System.out.print("Enter the  Choice whether you want to continue summing up the numbers or not (1 for yes and 0 for no) : ");

            choice = scan.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers is : " + SumEven);
        System.out.println("Sum of odd numbers is : " + SumOdd);

        scan.close();
    }
}
