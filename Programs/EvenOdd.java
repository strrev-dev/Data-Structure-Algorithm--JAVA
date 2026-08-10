import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         double number = scanner.nextDouble();
          if (number % 2 == 0) {
            System.out.println("Number is  even");
          }
            else{
                System.out.println("Number is odd");
            }
          }
    }

