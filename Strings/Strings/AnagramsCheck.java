package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class AnagramsCheck {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        // convert the strings to  lowercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if lengths are equal of the strings

        if (str1.length() == str2.length()) {
            // convert the string to char arrays
            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();

            //sort the array

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            boolean result = Arrays.equals(str1chararray, str2chararray);
            if (result) {
                System.out.println(str1 + "  and " + str2 + " are  anagrams of each other.");
            } else {
                System.out.println(str1 + "  and " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str1 + "  and " + str2 + " are not anagrams of each other.");
        }
    }
}
