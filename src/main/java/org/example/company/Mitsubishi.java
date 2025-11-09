package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Engine is starting smoothly";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = "Accelerating quickly";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }

    @Override
    public String brake() {
        String message = "Braking safely";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}