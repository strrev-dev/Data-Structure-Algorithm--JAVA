package Strings;

import java.util.Scanner;

public class Question1 {
    public static int LowercaseCount(String str){
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count =0;

         for(int i =0; i < str.length(); i++){
             char ch = str.charAt(i);

             if( ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' ){
                 count++;
             }
         }
         return count;
    }
    public static void main(String[] args){
        System.out.println("Enter the String value : ");
        String str = new Scanner(System.in).nextLine();

        System.out.println("Lowercase vowels in the string  is : " + LowercaseCount(str));

    }
}
