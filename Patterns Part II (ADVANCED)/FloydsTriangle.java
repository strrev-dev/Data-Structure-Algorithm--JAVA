
public class FloydsTriangle {

    public static void printfloydstraingle(int totrows) {
        // int count =1;
        int k = 1;
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Floyds Triangle :");
        printfloydstraingle(10);
    }
}
