class A {
    void display() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Method of class B");
    }
}

class C extends B {
    void run() {
        System.out.println("Method of class C");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c1 = new C();

        c1.run();
        c1.show();
        c1.display();
    }
}
