
public class LinearSearch {

    public static int LinearSearchArray(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 12;
        int index =LinearSearchArray(numbers, key);
        if(index == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number "+ key +  " found at index: " + index);
        }
        

    }
}
