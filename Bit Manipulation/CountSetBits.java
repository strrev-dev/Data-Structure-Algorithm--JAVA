import java.util.Scanner;

public class CountSetBits {
    public static int BrainKernighanAlgo(int num){
        int count = 0;
        while(num>0){
            num=  num &(num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print(BrainKernighanAlgo(number));
    }
}
