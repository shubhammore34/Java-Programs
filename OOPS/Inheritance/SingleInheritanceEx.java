class A {
    void display() {
        System.out.println("Display method of class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Show method of class B");
    }
}

public class SingleInheritanceEx {
    public static void main(String[] args) {
        B b1 = new B();
        b1.display(); //Display method of class A
        b1.show(); //Show method of class B
    }
}
