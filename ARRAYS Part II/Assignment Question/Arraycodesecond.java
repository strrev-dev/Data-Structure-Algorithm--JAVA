/* Question 2: There is an integer array nums sorted in ascending order (with distinct values). 
Prior to being passed to your function, nums is possibly rotated at an unknown 
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
example, [0,1,2,4,5,6,7] might be rotated
 at pivot index 3 and 
become [4,5,6,7,0,1,2]. 
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums. 
You must write an algorithm with O(log n) runtime complexity.  */

public class Arraycodesecond {

    public static int findminsearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;

            } else {
                right = mid;
            }
        }
        return left;

    }

    public static int search(int[] nums, int target) {
        int minIndex = findminsearch(nums);

        if (target >= nums[minIndex] && target <= nums[nums.length - 1]) {
            return binarySearch(nums, minIndex, nums.length -1, target);
        } else {
            return binarySearch(nums, 0, minIndex - 1, target);
        }
    }

    public static int binarySearch(int nums[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int index = search(nums, target);
        System.out.print(" The target " + target + " is found at index " + index);

    }
}
