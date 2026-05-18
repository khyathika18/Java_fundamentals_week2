package Java_week2;


class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}


class Vehicle {

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key ignition.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start button.");
    }
}