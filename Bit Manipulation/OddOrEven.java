import java.util.Scanner;

public class OddOrEven {
    public static void CheckEvenOrOdd(int num){
        int bitmask = 1; // bitmask is the number we use  to operate the and operator on the number  to get the value of first place only
        if((num & bitmask) == 0){
            System.out.println("This number is Even.");
        }else{
            System.out.println("This number is Odd.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number for checking even or odd : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        CheckEvenOrOdd(number);

    }

}
