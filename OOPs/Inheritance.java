public class Inheritance {
    public static void main(String[] args) {
      fish Shark = new fish();
      Shark.eat();
      Birds bird = new Birds();
      bird.eat();
//        Dog d1 = new Dog();
//        d1.breathe();
//        d1.smell();

    }
}
// Base Class
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
//derived class
class Mammals extends Animal{
    String legs;
    void sleep(){
        System.out.println("They can Sleep..");
    }
}
class Birds extends Animal{

    void fly(){
        System.out.println("They can fly..");
    }
}
//derived class multi inheritance level
//class Dog extends Mammals{
//    String breed;
//    void smell(){
//        System.out.println("Derived dog class/dogs can smell");
//    }
//
//}