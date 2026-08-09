
import java.util.Scanner;

public class PalindromeNumber {

    public static boolean palindromeNum(long num) {
        long OriginalNumber = num;
        long reverseNumber = 0;
        while (num != 0) {
            long remainder = num % 10;
            reverseNumber = reverseNumber*10 + remainder;
            num /= 10;
           

        }
         if (OriginalNumber == reverseNumber) {
                System.out.println("The number " + OriginalNumber + " is a palindrome");
                return true;
            } else {
                System.out.println("The number " + OriginalNumber + " is not a palindrome");
                return false;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        palindromeNum(number);
        sc.close();
    }
}
