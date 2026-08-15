import java.util.Scanner;
public class DiamondPattern {

    public static void printDiamondpattern(int rows){
         for(int i=1; i<=rows; i++){
            for( int j =1; j<=rows-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i -1; j++){
                System.out.print(" * ");
            }
            System.out.println();
         }
         for(int i=rows; i>=1; i--){
            for( int j =1; j<=rows-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i -1; j++){
                System.out.print(" * ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int rows = sc.nextInt();
        printDiamondpattern(rows);
    }
}
