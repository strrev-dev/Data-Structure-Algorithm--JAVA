/* Question 1. given an integer array nums, return true if any value appears at least twice  in the array and return false if every element is distinct */
public class Arrayscodefirst {

    public static boolean simdis(int nums[]) {
        //bruteforce On^2 time complexity

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 11, 11};
        System.out.print("The element in the arrray repeated? : " + simdis(nums));

    }
}
