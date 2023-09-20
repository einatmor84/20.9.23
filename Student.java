public class Student {
    String firstName;
    String lastName;
    int age;
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
}
