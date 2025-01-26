package br.com.cars.modules;

import br.com.cars.model.Car;
import br.com.cars.model.Driver;

import java.util.ArrayList;
import java.util.Scanner;

public class ModuleCar {
    private final ArrayList<Car> cars;
    private final Scanner scanner = new Scanner(System.in);
    private final ModuleDriver moduleDriver;

    public ModuleCar(ModuleDriver moduleDriver) {
        this.cars = new ArrayList<Car>();
        this.moduleDriver = moduleDriver;
    }

    public void linkDriver() {
        Car car = this.searchCarForPlate();

        System.out.print("Enter driver's CPF: ");
        String driverCPF = scanner.nextLine();
        Driver driver = this.moduleDriver.searchDriver(driverCPF);
        if (driver != null) {
            car.setDriver(driver);
            System.out.println("DriverView " + driver.getName() + " linked to car: " + car.getPlate());
        }
    }

    public void registerCar() {
        System.out.print("Enter plate: ");
        String plate = scanner.nextLine();
        Car car = this.searchCar(plate);
        if (car == null) {
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter tank capacity: ");
            int capacity = scanner.nextInt();
            this.addCar(plate, model, capacity);
            return;
        }
        System.out.println("Car " + car.getPlate() + " is already registered!");
    }

    public void addCar(String plate, String model, int tankCapacity) {
        this.cars.add(new Car(plate, model, tankCapacity));
    }

    public Car searchCarForPlate() {
        System.out.print("Enter plate number: ");
        String plateNumber = scanner.nextLine();
        Car car = this.searchCar(plateNumber);
        if (car != null) {
            System.out.println(car);
            return car;
        }
        System.out.println("Car not found!");
        return null;
    }

    public Car searchCar(String plate) {
        for (Car car : this.cars) {
            if (car.getPlate().equalsIgnoreCase(plate)) {
                return car;
            }
        }
        return null;
    }

    public void listCars() {
        for (Car car : this.cars) {
            System.out.println(car);
        }
    }

    public void listCarsByCPF() {
        System.out.print("Enter driver's CPF: ");
        String driverCPF = scanner.nextLine();

        for (Car car : this.cars) {
            Driver driver = car.getDriver();
            if (driver != null && driver.getCpf().equalsIgnoreCase(driverCPF)) {
                System.out.println(car);
            }
        }
    }
}
