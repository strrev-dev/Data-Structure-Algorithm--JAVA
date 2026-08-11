public class Pyramid {
    public static void printpyramid(int totrows){
        for(int i=1; i<=totrows; i++){

            for(int j=1; j<=totrows-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Pyramid :");
        printpyramid(20);

    }
}
