//Method Overloading


class Demo {
    void show(int age) {
        System.out.println("Integer: " + age);
    }

    void show(String name) {
        System.out.println("String: " + name);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(10);
        d.show("xyz");
    }
}