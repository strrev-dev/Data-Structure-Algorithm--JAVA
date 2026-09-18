
public class insertionSort {

    public static void insertionAlgo(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3, 5};
        int n = arr.length;
        insertionAlgo(arr, n);
        printArray(arr, n);
    }
}
