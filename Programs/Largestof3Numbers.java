import java.util.*;
public class Largestof3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A : ");
        int A = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("A is largest of them.");
        }
        else if(B>C){
            System.out.println("B is largest of them.");

        }
        else if(C>B){

            System.out.println("C is the largest of them.");
        }
        else {
            System.out.println("All are equal.");
        }
    }
}
