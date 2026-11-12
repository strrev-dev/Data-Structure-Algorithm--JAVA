import java.util.Scanner;

public class SortedoRNot {
    public static boolean isSorted(int arr[], int i){

        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " integers:");
        for(int i =0; i<size; i++){
            System.out.print("Element at index " + i + ": ");
            arr[i]= sc.nextInt();
        }
        System.out.println("\nYou entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Is this array sorted? : " + isSorted(arr, 0));
    }
}
