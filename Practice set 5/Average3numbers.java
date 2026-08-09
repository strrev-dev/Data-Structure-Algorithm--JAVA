
import java.util.Scanner;


public class Average3numbers {

    public static double averageNumber(double num1, double num2, double num3){
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, average;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enters second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        num3 = sc.nextDouble();
        
        averageNumber(num1, num2, num3);

    }
}
