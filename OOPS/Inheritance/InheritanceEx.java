class Vehicle {
    double price;
    double mileage;
    String color;

    void display() {
        System.out.println("Price : " +price);
        System.out.println("Mileage : " +mileage);
        System.out.println("Color : " +color);
    }
}

class Car extends Vehicle {
    String fueltype;
    boolean sunroof;
    String brand;
}

public class InheritanceEx {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Tata";
        car1.price = 1500000;
        car1.mileage = 18.3;
        car1.fueltype = "Disel";
        car1.color = "Red";
        car1.sunroof = true;

        car1.display();

        System.out.println(car1.sunroof);


    }
}
