package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Constructors
    public CarSkeleton() {}

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Methods
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine starting");
    }

    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving");
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " running engine...");
    }
}
