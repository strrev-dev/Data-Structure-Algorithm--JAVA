
import java.util.HashSet;

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

    //hashset method O(n) complexity
    public static boolean duplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 11};
        // System.out.print("The element in the arrray repeated? : " + simdis(nums));
        System.out.print("The element in the arrray repeated? : " + duplicate(nums));

    }
}
