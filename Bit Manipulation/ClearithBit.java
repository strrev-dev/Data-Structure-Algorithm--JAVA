import java.util.Scanner;

public class ClearithBit {
    public static int ClearBit(int num, int i ){
        int bitmask = ~(1<<i);
         return num & (bitmask);
    }
    public static void main(String[] args){
        System.out.print("Ente the number value : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Enter ith value : ");
        int i = sc.nextInt();

        System.out.println(ClearBit(number, i));
    }
}
