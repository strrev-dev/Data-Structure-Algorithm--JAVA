import java.util.Scanner;

public class IncreasingOrder {
    public static void printInc(int n){
 if(n==1){
     System.out.print(n+ " ");
     return;
 }
 printInc(n-1);
 System.out.print(n + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();
        printInc(n);
    }
}
