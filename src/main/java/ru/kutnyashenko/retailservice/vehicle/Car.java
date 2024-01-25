package ru.kutnyashenko.retailservice.vehicle;

public class Car extends Vehicle{

    private final String bodywork;

    public Car(String name, int numberOfWheels, int maxSpeed, String bodywork) {
        super(name, numberOfWheels, maxSpeed);
        this.bodywork = bodywork;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип кузова: " + bodywork);
    }
}
