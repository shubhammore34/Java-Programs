class Dog {
    String name;

    public void eat() {
        System.out.println(name + " eats");
    }
}

class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bruno";

        dog1.eat();
    }
}


