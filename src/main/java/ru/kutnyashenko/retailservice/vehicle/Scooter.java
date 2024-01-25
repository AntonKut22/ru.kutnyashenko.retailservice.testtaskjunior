package ru.kutnyashenko.retailservice.vehicle;

public class Scooter extends Vehicle{

    private final int loadCapacity;

    public Scooter(String name, int numberOfWheels, int maxSpeed, int loadCapacity) {
        super(name, numberOfWheels, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Грузоподъемность: " + loadCapacity);
    }
}
