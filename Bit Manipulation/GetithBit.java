import java.util.Scanner;

public class GetithBit {
    public static int GetBit(int number, int i){
        int bitmask = 1<<i;
        if( (number & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number  : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Enter ith number : ");
        int i = sc.nextInt();
        System.out.print(GetBit(number, i));
    }
}
