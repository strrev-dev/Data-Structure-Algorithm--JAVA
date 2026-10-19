package Strings;

public class FunctionSubstrings {
    public static String getSubstring(String str, int st, int en){
        String substring ="";
        for(int i =st; i<en; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        //this is substring function
//        System.out.println(str.substring(0,4));
        System.out.println("The Substring is : "+ getSubstring(str,0,4));
    }
}
