package ru.kutnyashenko.retailservice.vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType){
        return switch (vehicleType){
            case BIKE -> new Bike("Мотоцикл", 2, 280, 4);
            case SCOOTER -> new Scooter("Самокат", 2, 30, 100);
            case CAR -> new Car("Автомобиль", 4, 150, "Седан");
            case BUS -> new Bus("Автобус", 6, 100, 50);
        };
    }
}
