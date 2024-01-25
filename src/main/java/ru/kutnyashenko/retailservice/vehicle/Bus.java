package ru.kutnyashenko.retailservice.vehicle;

public class Bus extends Vehicle{

    private final int maxNumberOfPassengers;

    public Bus(String name, int numberOfWheels, int maxSpeed, int maxNumberOfPassengers) {
        super(name, numberOfWheels, maxSpeed);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Максимальное количество пассажиров: " + maxNumberOfPassengers);
    }
}
