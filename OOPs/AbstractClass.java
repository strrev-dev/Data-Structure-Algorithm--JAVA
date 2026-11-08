public class AbstractClass {
    public static void main(String[] args) {

                Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        Mustang myhorse = new Mustang();

    }
}

abstract class Animals {
    //constructor without object creation of abstract class

    Animals(){
        String Color;
        System.out.println("Animals constructor calling..");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animals {
    Horse(){
        System.out.println("Horse constructor calling..");
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor calling..");
    }
}

class Chicken extends Animals {

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
