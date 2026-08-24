public class MaxSubarray_Kadane {

    public static int Kadane_algo(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            
            // Update maxSum before resetting currSum to handle all-negative arrays
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {-1, 2, -3, -4};
        int result = Kadane_algo(numbers);
        System.out.println("Max Sum is : " + result);
    }
}