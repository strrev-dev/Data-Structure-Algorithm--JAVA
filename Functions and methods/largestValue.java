

public class largestValue {

    public static int GetLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 1, 5, 10, 4, 1};
        GetLargest(numbers);
        System.out.print("The largest number in this Array : " + GetLargest(numbers));
    }
}
