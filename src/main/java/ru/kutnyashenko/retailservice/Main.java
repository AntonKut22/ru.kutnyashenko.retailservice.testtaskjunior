package ru.kutnyashenko.retailservice;

import ru.kutnyashenko.retailservice.vehicle.VehicleFactory;
import ru.kutnyashenko.retailservice.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        for (String arg : args) {
            int vehicleTypeNumber;
            try {
                vehicleTypeNumber = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("В качестве параметров необходимо ввести цифру (или несколько, " +
                        "разделенных пробелом) от 0 до " + (VehicleType.values().length - 1));
                continue;
            }
            if (vehicleTypeNumber >= 0 && vehicleTypeNumber < VehicleType.values().length) {
                vehicleFactory.getVehicle(VehicleType.values()[vehicleTypeNumber]).displayInfo();
            } else {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }
        }
    }
}