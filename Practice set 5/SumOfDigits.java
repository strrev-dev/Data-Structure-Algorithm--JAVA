import java.util.Scanner;
public class SumOfDigits {
    
    public static void digitSum(int n){
        int sum = 0;
        while(n>0){
            int  lastDigit =  n%10;
            sum+= lastDigit;
            n/=10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
         digitSum(n);
    }

}
