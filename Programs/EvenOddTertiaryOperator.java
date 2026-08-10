import java.util.*;
public class EvenOddTertiaryOperator{
    public static void main( String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println("The number is : " + result);
    }
}