
import java.util.Scanner;

public class InveretedStarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of  lines (NL) the star pattern should have : ");
        int NL = sc.nextInt();
        System.out.println("The star pattern is : ");
        for (int rows = 1; rows <= NL; rows++) {
            for (int cols = NL + (-rows + 1); cols >= 1; cols--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
