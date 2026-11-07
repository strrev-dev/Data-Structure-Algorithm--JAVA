public class Inheritance {
    public static void main(String[] args) {
      fish Shark = new fish();
      Shark.eat();
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("breathes");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}