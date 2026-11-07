public class MethodOverridingPoly {
    public static void main(String[] args) {
        Books book = new Books();
        book.read();
    }
}
class Books{
    void read(){
        System.out.println("reading");
    }
}
class physics extends Books{
    void read(){
        System.out.println("reading physics");
    }
}
