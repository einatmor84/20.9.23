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
        System.out.printf("Student name: %s, last name: %s, age: %d\n", student2.firstName,student2.lastName, student2.age);

        Student student3 = new Student("a", "b");
        Student student4 = new Student();

    }
}
