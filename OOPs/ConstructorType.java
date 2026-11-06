public class ConstructorType {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 24);
        Student s3 = new Student(s2);
        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s3.age);
        System.out.println(s3.name + " " + s3.age);

    }
    static class Student {
        String name;
        int age;

        //Non - paramaterized/no argument (set default fallback values)
        public Student() {
            this.name = "Unknown";
            this.age = 24;
        }
        // parameterized
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // copy constructor
        public Student( Student s3){
            this.name = s3.name;
            this.age = s3.age;
        }
    }
}
