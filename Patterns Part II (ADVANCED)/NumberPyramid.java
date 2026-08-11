public class NumberPyramid {

    public static void printnumberpyramid(int totrows){
        for(int i =1; i<=totrows; i++){
            for(int j=1; j<=totrows-i+1; j++){
             System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        System.out.println("Number Pyramid :");
        printnumberpyramid(10);
    }
}
