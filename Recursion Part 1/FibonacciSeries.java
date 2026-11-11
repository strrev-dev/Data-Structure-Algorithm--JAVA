import java.util.Scanner;

public class FibonacciSeries {
    public static int PrintFibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int Fn = PrintFibonacci(n-1)+ PrintFibonacci(n-2);
        return Fn;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value n : ");
        int n = sc.nextInt();
        System.out.print(PrintFibonacci(n));
    }
}
