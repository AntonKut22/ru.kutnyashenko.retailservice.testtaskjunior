package ru.kutnyashenko.retailservice.vehicle;

public class Bike extends Vehicle {

    private final int numberStrokeEngine;

    public Bike(String name, int numberOfWheels, int maxSpeed, int numberStrokeEngine) {
        super(name, numberOfWheels, maxSpeed);
        this.numberStrokeEngine = numberStrokeEngine;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество тактов у двигателя: " + numberStrokeEngine);
    }
}
