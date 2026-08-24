
public class MaxSubarray_Prefix {

    public static void prefixSummation(int numbers[]) {

        int currSum = 0;
        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum  : " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {1, -2, 6, -1, 3};
        prefixSummation(numbers);
    }
}
