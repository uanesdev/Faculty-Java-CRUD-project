package br.com.cars.modules;

import br.com.cars.model.Car;
import br.com.cars.model.Driver;
import java.util.ArrayList;
import java.util.Scanner;

public class ModuleCar {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void linkDriver() {
        Car car = searchCarForPlate();

        System.out.print("Enter driver's CPF: ");
        String driverCPF = scanner.nextLine();
        Driver driver = ModuleDriver.searchDriver(driverCPF);
        if (driver != null) {
            assert car != null; //OBS
            car.setDriver(driver);
            System.out.println("Driver " + driver.getName() + " linked to car: " + car.getPlate());
        }
    }

    public static void registerCar() {
        System.out.print("Enter plate: ");
        String plate = scanner.nextLine();
        Car car = searchCar(plate);
        if (car == null) {
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter tank capacity: ");
            int capacity = scanner.nextInt();
            addCar(plate, model, capacity);
            return;
        }
        System.out.println("Car " + car.getPlate() + " is already registered!");
    }

    public static void addCar(String plate, String model, int tankCapacity) {
        cars.add(new Car(plate, model, tankCapacity));
        System.out.println("Car " + plate + " added to car list");
    }

    public static Car searchCarForPlate() {
        System.out.print("Enter plate number: ");
        String plateNumber = scanner.nextLine();
        Car car = searchCar(plateNumber);
        if (car != null) {
            System.out.println(car);
            return car;
        }
        System.out.println("Car not found!");
        return null;
    }

    public static Car searchCar(String plate) {
        for (Car car : cars) {
            if (car.getPlate().equalsIgnoreCase(plate)) {
                return car;
            }
        }
        return null;
    }

    public static void listCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars found!");
            return;
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void listCarsByCPF() {
        System.out.print("Enter driver's CPF: ");
        String driverCPF = scanner.nextLine();

        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver != null && driver.getCpf().equalsIgnoreCase(driverCPF)) {
                System.out.println(car);
            }
        }
        System.out.println("Driver not found!");
    }
}
