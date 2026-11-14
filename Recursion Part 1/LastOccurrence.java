import java.util.Scanner;

public class LastOccurrence {
    public static int printLastoccurrence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int IsFound = printLastoccurrence(arr, i + 1, key);
            if (IsFound == -1 && arr[i] == key) {
                return i;
            }
            return IsFound;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nYou entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Enter the  element value : ");
        int element = sc.nextInt();

        System.out.print("Last occurence of " + element + " is " + printLastoccurrence(arr, 0, element));
        sc.close();
    }
}

