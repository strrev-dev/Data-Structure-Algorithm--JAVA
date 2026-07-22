/* Question 2: In a program, input the side of a square. You have to output the area of the
 square.
 (Hint : area of a square is (side x side) */

import java.util.Scanner;

public class question2 {
    public static void main(String args[]){
  
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int AreaOfTheSquare = side*side;
        System.out.println(AreaOfTheSquare);

    }
}
