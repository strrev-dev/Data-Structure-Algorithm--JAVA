
import java.util.Scanner;

public class HollowRhombus {

    public static void HollowRhombusprint(int n) {

        for(int i =1 ; i <= n; i++){

            for(int j = 1; j<= n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j <=n; j++){
                if( i==1 ||  i==n || j==1|| j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scan.nextInt();
        HollowRhombusprint(n);
        scan.close();
    }
}
