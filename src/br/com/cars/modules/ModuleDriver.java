package br.com.cars.modules;

import br.com.cars.model.Driver;
import java.util.ArrayList;
import java.util.Scanner;

public class ModuleDriver {
    private static final ArrayList<Driver> drivers = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void registerDriver() {
        System.out.print("Enter the driver's CPF: ");
        String driverCPF = scanner.nextLine();
        Driver driver = searchDriver(driverCPF);
        if (driver == null) {
            System.out.print("Enter the driver's name: ");
            String driverName = scanner.nextLine();
            addDriver(driverName, driverCPF);
            return;
        }
        System.out.println("Driver already exists!");
    }

    public static void addDriver(String name, String cpf) {
        drivers.add(new Driver(name, cpf));
    }

    public static void searchDriverByCPF() {
        System.out.print("Enter the driver's CPF: ");
        String driverCPF = scanner.nextLine();
        Driver driver = searchDriver(driverCPF);
        if (driver != null) {
            System.out.println(driver);
            return;
        }
        System.out.println("Driver not found!");
    }

    public static Driver searchDriver(String cpf) {
        for (Driver driver : drivers) {
            if (driver.getCpf().equals(cpf)) {
                return driver;
            }
        }
        return null;
    }

    public static void listDrivers() {
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }
}
