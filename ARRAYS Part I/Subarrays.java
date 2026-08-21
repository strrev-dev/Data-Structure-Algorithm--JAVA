public class Subarrays {

    public static void PairsSubarrays(int numbers[]) {
        int Smallest_Sum = Integer.MAX_VALUE;
        int Largest_Sum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // j starts at i to include 1-element subarrays
            for (int j = i; j < numbers.length; j++) { 
                
                int sum = 0; // RESET sum for each new subarray

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; // Calculate current subarray sum
                }

                System.out.print(" | Sum = " + sum);
                System.out.println();

                // Update min and max IMMEDIATELY for each subarray
                if (sum < Smallest_Sum) {
                    Smallest_Sum = sum;
                }
                if (sum > Largest_Sum) {
                    Largest_Sum = sum;
                }
            }
            System.out.println();
        }

        // Print final min/max AFTER all loops finish
        System.out.println("Smallest Sum : " + Smallest_Sum);
        System.out.println("Largest Sum  : " + Largest_Sum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 6, 8, 10};
        PairsSubarrays(numbers);
    }
}