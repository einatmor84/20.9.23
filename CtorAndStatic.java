import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student student1 = new Student("Avi", "cohen", 50);
        /*student1.firstName = "Avi";
        student1.lastName = "cohen";
        student1.age = 50;*/
        System.out.printf("Student name: %s, last name: %s, age: %d\n", student1.firstName,student1.lastName, student1.age);
        Student student2 = new Student("Ester", "Shapira", 25);
        //System.out.printf("Student name: %s, last name: %s, age: %d\n", student2.firstName,student2.lastName, student2.age);
        student2.ToString();
        Student student3 = new Student("a", "b");
        Student student4 = new Student();

        student1.ToString();
        System.out.println(Student.collageName); // calling static from class!
    }
}



public class Student {
    String firstName;
    String lastName;
    int age;
    static String collageName = "Smart";
     Student(String firstName, String lastName, int age){  // constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
     Student(String firstName, String lastName){  // constructor
        this.firstName = firstName;
        this.lastName = lastName;
    }
     Student(){
         System.out.println("new Student has created");
    }
    public void ToString(){
        System.out.println("Student name: " + firstName + " "  + lastName + ", age:  " + age + ",  collage name: " + collageName );
    }

}
