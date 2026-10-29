import java.util.Scanner;

public class ClearIBits {
    public static int clearibit( int num , int i){
        int bitmask = (~0<<i);
        return  num & bitmask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number value : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();
        System.out.print(clearibit(number, i));
    }
}
