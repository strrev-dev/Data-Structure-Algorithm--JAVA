
public class Trappnig_water {

    public static int TrappedRainWater(int height[]) {
        //left max  of the boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        //right max of the boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = (height.length - 1) - 1; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        //  water level 
        int trappedwater = 0;
        for (int i = 0; i < height.length; i++) {

            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater +=waterlevel - height[i];
        }
        return trappedwater;

        // trapped water
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print("Trapped water : "+TrappedRainWater(height));
    }
}
