import java.util.Scanner;
public class HalfPyramidPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Half Pyramid Pattern:");
        for(int i=1; i<= rows; i++){
            for(int number = 1; number<=i; number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
