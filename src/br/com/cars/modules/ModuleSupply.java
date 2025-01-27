package br.com.cars.modules;

import br.com.cars.model.Car;
import br.com.cars.model.Supply;

import java.util.Scanner;

public class ModuleSupply {
    private static final Scanner scanner = new Scanner(System.in);

    public static void registerSupply() {
        System.out.print("Enter car's plate: ");
        String plate = scanner.nextLine();
        Car car = ModuleCar.searchCar(plate);
        if (car != null) {
            System.out.print("Enter fuel type: ");
            String fuelType = scanner.nextLine();
            System.out.print("Enter liters: ");
            double liters = scanner.nextInt();
            if (liters > car.getTankCapacity()) {
                System.out.println("Tank capacity exceeded");
                return;
            }
            System.out.print("Enter liter price: ");
            double literPrice = scanner.nextInt();
            addSupply(car, fuelType, liters, literPrice);
            System.out.println("Supply has been registered.");
            return;
        }
        System.out.println("Car not found.");
    }

    public static void addSupply(Car car,
                                 String fuelType,
                                 double liters,
                                 double literValue) {
        car.getSupplys().add(new Supply(car, fuelType, liters, literValue));
    }

    public static void listSupplys() {
        System.out.print("Enter car's plate: ");
        String plate = scanner.nextLine();
        Car car = ModuleCar.searchCar(plate);
        Integer countSupply = 1;
        if (car != null) {
            if (car.getSupplys().isEmpty()) {
                System.out.println("No supply found!");
                return;
            }
            for (Supply supply : car.getSupplys()) {
                System.out.printf("%dº Supply\n", countSupply);
                System.out.println(supply);
                countSupply++;
            }
            return;
        }
        System.out.println("Car not found!");
    }
}
