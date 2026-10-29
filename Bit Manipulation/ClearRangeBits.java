import java.util.Scanner;

public class ClearRangeBits {
    public static int clearRangeofBits(int num, int i, int j){
        int bitmask = (~0<<(j+1)) | ((1<<i)-1);

        return num & bitmask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number value : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();
        System.out.print("Enter the jth value : ");
        int j = sc.nextInt();
        System.out.print(clearRangeofBits(number, i,j));
    }
}
