/*Question1: Write a Java program to get a number from the user and print whether it is
 positive or negative. */

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("PLease enter the number ");
         int number = sc.nextInt();

         if(number>=0){
            System.out.println("The number is positive");
         }
         else {
            System.out.println("Number is negative");
         }
    }
}
