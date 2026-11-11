import java.util.Scanner;

public class SumOfNaturalNum {
    public static int PrintSum(int n){
        if (n < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
            return -1; // Sentinel value to flag an error
        }
        if(n==0){
            return 0;
        }
        int Sm = n +  PrintSum(n-1);
        return Sm;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value n : ");
        int n = sc.nextInt();
        System.out.print(PrintSum(n));
    }
}
