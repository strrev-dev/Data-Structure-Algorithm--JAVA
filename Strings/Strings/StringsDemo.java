package Strings;
import java.util.Scanner;

public class StringsDemo {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your string is : " + name);
        sc.close();
    }
}