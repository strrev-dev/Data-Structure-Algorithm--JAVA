
import java.util.*;

public class Calculator {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number A : ");
        double A = scan.nextDouble();
        System.out.print("Enter number B : ");
        double B = scan.nextDouble();
        System.out.print("Enter operator : ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition of A and B is : " + (A + B));
                break;
            case '-':
                System.out.println("Substraction of A from B is: " + (B - A));
                break;
            case '*':
                System.out.println("Multiplication of A and B is : " + (A * B));
                break;
            case '/':
                System.out.println("Division of A by B is : " + (A / B));
                break;
            case '%':
                System.out.println("Modulus of  A and B is : " + (A % B));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
