import java.util.Scanner;

public class UpdateBit {
    public static int updateithbit(int num , int i , int target) {
   if(target ==1){
       return num | (1<<i);
   }
   else {
       return num & ~(1<<i);
   }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number value : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();
        System.out.print("Enter the Target value : ");
        int Target = sc.nextInt();

        System.out.println(updateithbit(number, i , Target));

    }
}
