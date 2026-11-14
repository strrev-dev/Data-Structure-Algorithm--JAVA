import java.util.Scanner;

public class FirstOccurence {
    public static int printFirstoccurence(int arr[], int i,int key){
 if(arr[i]==key){
     return i;
 }
 if(i == arr.length){
     return -1;
 }
 return printFirstoccurence(arr,i+1,key);
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
        System.out.print("Enter the  element value : ");
        int element = sc.nextInt();

        System.out.print("First occurence of " + element + " is "+ printFirstoccurence(arr,0,element));
    }
}
