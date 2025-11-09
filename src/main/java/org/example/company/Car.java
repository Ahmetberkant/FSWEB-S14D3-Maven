package org.example.company;

public class Car {

    private int cylinders;
    private String name;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() { return cylinders; }
    public String getName() { return name; }

    public String startEngine() {
        String message = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String accelerate() {
        String message = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    public String brake() {
        String message = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
