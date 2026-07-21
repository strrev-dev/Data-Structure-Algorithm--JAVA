
import java.util.Scanner;

public class LargestOftwoNumbers {
    public static void main(String[] args) {
     

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
     
        if(x>y){
            System.out.println("X is greater than Y");
        }
        else if(x==y){
            System.out.println("Both values are equal");
        }
        else{
            System.out.println("Y is greater than X");
        }
    }
    
}
