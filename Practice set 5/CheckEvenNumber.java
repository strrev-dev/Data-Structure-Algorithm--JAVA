
import java.util.Scanner;

public class CheckEvenNumber {

   public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
            return true;
        } else {
            System.out.println("The number " + number + " is odd");
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        isEvenNumber(number);

        sc.close();

    }
}
