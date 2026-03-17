// single inheritance 


class Person {
    String name = "xyz";
    int age = 20;

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int marks = 85;

    void showStudent() {
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showPerson();
        s.showStudent();
    }
}



  






