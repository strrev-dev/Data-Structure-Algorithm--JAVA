
public class PairsArrayElement {

    public static void PrintPairs(int numbers[]) {
        int total_pairs= 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.print("Total pairs = " + total_pairs);

    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 6, 7, 8, 9};
        PrintPairs(numbers);

    }
}
