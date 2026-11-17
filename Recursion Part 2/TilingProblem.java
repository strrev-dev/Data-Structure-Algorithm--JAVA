public class TilingProblem {
    public static int tilingWays(int n) {
        // Base Case: 0 length left = 1 way, 1 length left = 1 way
        if (n == 0 || n == 1) {
            return 1;
        }

        // Kaam (Choices):
        // 1. Vertical placement -> remaining length is (n - 1)
        int verticalWays = tilingWays(n - 1);

        // 2. Horizontal placement -> remaining length is (n - 2)
        int horizontalWays = tilingWays(n - 2);

        // Total ways
        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways for 2 x " + n + " floor: " + tilingWays(n)); // Output: 5
    }
}