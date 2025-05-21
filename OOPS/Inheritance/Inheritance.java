class parentClass {
    void display() {
        System.out.println("Parent class method");
    }
}

class childClass extends parentClass {
    void show() {
        System.out.println("Child class method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();

    }
}
