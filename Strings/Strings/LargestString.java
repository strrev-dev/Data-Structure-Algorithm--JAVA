package Strings;

public class LargestString {
    public static void main(String[] args){
        String Fruits[] = {"apple", "banana", "mango", "orange"};
         String largest = Fruits[0];
         for(int i =1; i<Fruits.length;i++){
             if(Fruits[i].compareTo(largest)>0){
                 largest = Fruits[i];
             }
         }
         System.out.println(largest);
    }
}
