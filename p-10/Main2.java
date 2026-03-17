//Multilevel inheritance 



class Person {
    String name = "Ram";
}

class Student extends Person {
    int marks = 90;
}

class DsyStudent extends Student {
    String degree = "B.Tech";

    void show() {
        System.out.println(name + " " + marks + " " + degree);
    }
}

public class Main2 {
    public static void main(String[] args) {
        DsyStudent g = new DsyStudent();
        g.show();
    }
}