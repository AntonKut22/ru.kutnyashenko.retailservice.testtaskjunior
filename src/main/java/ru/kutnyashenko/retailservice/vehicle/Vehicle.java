package ru.kutnyashenko.retailservice.vehicle;

public class Vehicle {
    private final String name;
    private final int numberOfWheels;
    private final int maxSpeed;

    public Vehicle(String name, int numberOfWheels, int maxSpeed) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo(){
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Кол-во колес: " + numberOfWheels);
        System.out.println("Максимальная скорость: " + maxSpeed);
    }
}
