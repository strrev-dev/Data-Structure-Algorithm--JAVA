import java.util.*;
public class ArirthmeticOperators {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        double A = scan.nextDouble();
        System.out.print("Enter the value of B : ");
        double B = scan.nextDouble();
        System.out.println("Addition of A and B is : " + (A+B));
        System.out.println("Substraction of A from B is : " + (B-A));
        System.out.println("Multiplication of A and B is : " + (A*B));
        System.out.println("Division of A by B is : " + (A/B));
        System.out.println("Modulus of A and B is : " + (A%B));
    }
}