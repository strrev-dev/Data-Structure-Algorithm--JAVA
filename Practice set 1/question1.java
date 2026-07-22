import java.util.*;

/*In a program, input 3 numbers: A, B andC. Youhave to output the average of
 these 3 numbers.
 (Hint : Average of N numbers is sum of those numbers divided by N) */
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        float avg = (a+b+c)/3;
        System.out.println(avg);
        sc.close();
    }


}