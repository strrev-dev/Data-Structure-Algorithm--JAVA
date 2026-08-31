/* Question 4: Given n non-negative integers representing an elevation map where the width of 
each bar is 1, compute how much water it can trap after raining. */

public class Arraycodefourth {

    public static int trappedwater(int[] height) {

        //leftmax boundary
        int n = height.length;
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < n ; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        //rightmax boundary 

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trap_water = 0;
        for (int i = 0; i < n; i++) {

            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trap_water += waterlevel - height[i];
        }
        return trap_water;
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print("trapped water  in elevation map is : " + trappedwater(height));
    }
}
