import java.util.Scanner;

public class SetithBit {
    public static int SetBit(int num, int i) {
        int bitmask = 1 << i;

        return num | bitmask;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number  : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Enter ith number : ");
        int i = sc.nextInt();
        System.out.print(SetBit(number, i));
    }
}

