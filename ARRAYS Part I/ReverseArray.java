
public class ReverseArray {

    public static int ReverseArrayvalue(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
         ReverseArrayvalue(numbers);
         for (  int i = 0; i< numbers.length; i++){
            System.out.print( numbers[i]+ ", ");

         }
        

    }

}
