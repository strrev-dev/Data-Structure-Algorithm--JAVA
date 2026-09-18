import java.util.Arrays;
public class InbuildArrays {
    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mainA(String[] args){
        int arr[] = {2, 1, 4, 3, 5};
        Arrays.sort(arr);
        printArray(arr, arr.length);
    }
}
