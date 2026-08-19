
public class SmallestValue {

    public static int GetSmallest(int numbers[]) {

        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 1, 5, 10, 4, 0};
        // GetSmallest(numbers);
        System.out.print("The Smallest number in this Array : " + GetSmallest(numbers));
    }
}
