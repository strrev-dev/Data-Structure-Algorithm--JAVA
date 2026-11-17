import java.util.Scanner;

public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // Single + Pair up with (n - 1) choices
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of n: ");
        int n = sc.nextInt();
        System.out.println( " Total ways of single and pair : " + friendsPairing(n));
    }
}
