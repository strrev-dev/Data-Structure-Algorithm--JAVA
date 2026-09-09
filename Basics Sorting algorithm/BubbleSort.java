
public class BubbleSort {

    public static void bubbleAlgo(int[] numbers, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    public static void printArray(int[] numbers, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        // int numbers[] = {5, 1, 4, 2, 8};
        int numbers[] = {1,2,3,4,5};
        int n = numbers.length;

        bubbleAlgo(numbers, n);
        printArray(numbers, n);

    }
}
