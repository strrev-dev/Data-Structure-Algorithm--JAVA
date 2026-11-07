public class CopyConstructor {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "deepan";
        s1.age = 10;
        s1.password = "Deepan#10";
        s1.marks[0] = 100;
        s1.marks[1] = 100;
        s1.marks[2] = 100;
        Students s2 = new Students(s1);
        for(int i = 0; i < 3; i++) {
            System.out.println("Marks : "+ s2.marks[i]);
        }
        s2.password = "Maurya#10";
        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);

    }
}

class Students {
    String name;
    int age;
    String password;
    int marks[];


    //copy constructor
    Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.password = s1.password;
        this.marks = s1.marks;

    }

    Students() {
        marks = new int[3];
        System.out.println("Student constructor created....");
    }

    Students(String name) {
        marks = new int[3];
        this.name = name;
    }

    Students(int age) {
        marks = new int[3];
        this.age = age;
    }
}


