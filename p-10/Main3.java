//Hierachical Inheritance



class Person {
    String name = "Utsav";
}

class Student extends Person {
    void showStudent() {
        System.out.println("Student: " + name);
    }
}

class Teacher extends Person {
    void showTeacher() {
        System.out.println("Teacher: " + name);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.showStudent();
        t.showTeacher();
    }
}