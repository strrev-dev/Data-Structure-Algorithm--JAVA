public class Constructor {
    public static void main(String[] args) {
Student s1 = new Student(23);
System.out.println( s1.Roll_number);
    }
}
 class Student{

     int Roll_number;
     String name;
     int age;

     //if not default  we can write the constructor here to call
     Student(  int Roll_number){
//         this.name = name;
         this.Roll_number = Roll_number;
//         this.age = age;
         System.out.println("Student Constructor calling...");
     }
        }