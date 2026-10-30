import java.util.Scanner;

public class FastExponentiation {
    public static int FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;

            }
            a = a*a;
            n = n >> 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base a : ");
        int base = sc.nextInt();
        System.out.print("Enter the power n : ");
        int power = sc.nextInt();
        System.out.print(FastExpo(base, power));
    }
}
