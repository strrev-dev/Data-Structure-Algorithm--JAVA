
public class StarPattern {

    public static void main(String[] args) {
       System.out.println("Star Pattern : ");
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
