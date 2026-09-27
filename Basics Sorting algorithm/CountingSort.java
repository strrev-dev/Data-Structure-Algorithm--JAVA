
public class CountingSort {

    public static void countSort(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5, 1, 2, 7};
        int n = arr.length;

        countSort(arr, n);
        printArray(arr, n);
    }
}
