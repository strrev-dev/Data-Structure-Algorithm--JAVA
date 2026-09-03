/* Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],   
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets.  */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraycodeFifth {

    public static List<List<Integer>> tripletcheck(int nums[]) {
        Set<List<Integer>> resultSet = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        //sorting 
                        Collections.sort(triplet);
                        resultSet.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println("Brute Force Result: " + tripletcheck(nums));
    }
}
