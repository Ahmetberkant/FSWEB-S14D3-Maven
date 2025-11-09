package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = "Accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String brake() {
        String message = "Braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
