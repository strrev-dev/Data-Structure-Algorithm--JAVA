import java.util.Scanner;

public class CheckPowers {
    public static Boolean IfpowerOf2(int num) {
  return (num & (num-1)) ==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it's power of 2 or not : ");
        int number = sc.nextInt();

        System.out.print(IfpowerOf2(number));
    }
}
