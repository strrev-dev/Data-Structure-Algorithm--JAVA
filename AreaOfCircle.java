import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double radius = scan.nextDouble();
        double area = Math.PI *radius*radius;
        System.out.println("Area of circle is  : " + area);
    }
}