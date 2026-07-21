import java.util.*;
public class ProductsofIntegers {
    public static void main(String argsp[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number A : ");
        int A =scan.nextInt();
        System.out.print("Enter number B n:");
        int B = scan.nextInt();
        int Product = A*B;
        System.out.println("Product of A and B is :" + Product);
    }
}
