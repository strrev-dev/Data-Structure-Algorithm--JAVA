package Strings;

public class CompareValues {
    public static void main(String[] args) {
        String s1 = "Deepan";
        String s2 = "Deepan";
        String s3 = new String("Deepan");

//        if(s1==s3){
//            System.out.println("String are equals .");
//        }else {
//            System.out.println("Strings are not equal.");
//        }
        //using equals it will check the value of the strings for comparison.
        if (s1.equals(s3)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
