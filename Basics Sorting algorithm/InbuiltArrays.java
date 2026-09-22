import java.util.Arrays;
import java.util.Collections;
public class InbuiltArrays {

    // public static void printArray(int arr[], int n) {
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = {2, 1, 4, 3, 5};
        Integer arr[] = {2, 1, 4, 3, 5};
        // Arrays.sort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArray(arr);
    }
}
