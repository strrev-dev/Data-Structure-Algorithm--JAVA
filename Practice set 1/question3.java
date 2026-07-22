/* Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
import  java.util.*;

public class question3 {
    public static void main(String[] args) {
        System.out.print("Please Enter the cost of a Pencil: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.print("\nPlease Enter the cost of a Pen: ");
        float b = sc.nextFloat();
        System.out.print("\nPlease Enter the cost of a Eraser: ");
        float c = sc.nextFloat();
        float totalCost = a+b+c;
        float gst = totalCost*0.18f;
        System.out.println("Your Total cost with gst of the items are : " + (totalCost +gst));
    }
}
