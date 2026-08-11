public class Traingle {
    public static void PrintTraingle_0_1_pattern(int totrows ){
        for(int i=1; i<=totrows; i++){
            for(int j =1; j<=i; j++){
                if((i+j)%2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args){

        System.out.println("Traingle 0-1 pattern :");
        PrintTraingle_0_1_pattern(5);
    }
}
