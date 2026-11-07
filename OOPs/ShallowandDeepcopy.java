public class ShallowandDeepcopy {
    public static void main(String[] args) {

        Stud s1 = new Stud();
        s1.name = "deepan";
        s1.age = 10;
        s1.password = "Deepan#10";
        s1.marks[0] = 100;
        s1.marks[1] = 100;
        s1.marks[2] = 100;
        Stud s2 = new Stud(s1);
        s1.marks[0] = 45;
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks : " + s2.marks[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks : " + s1.marks[i]);
        }
        s2.password = "Maurya#10";
        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);

    }
}

class Stud {
    String name;
    int age;
    String password;
    int marks[];


    //Shallow copy constructor
//    Stud(Stud s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.age = s1.age;
//        this.password = s1.password;
//        this.marks = s1.marks;
//
//    }
    //deep copy constructor

    Stud(Stud s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Stud() {
        marks = new int[3];
        System.out.println("Stud constructor created....");
    }

    Stud(String name) {
        marks = new int[3];
        this.name = name;
    }

    Stud(int age) {
        marks = new int[3];
        this.age = age;
    }
}

