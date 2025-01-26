package br.com.cars.modules;


import br.com.cars.model.Driver;
import br.com.cars.menus.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ModuleDriver {
    private final ArrayList<Driver> drivers;
    private final Scanner scanner = new Scanner(System.in);

    public ModuleDriver() {
        this.drivers = new ArrayList<>();
    }

    private void registerDriver() {
        System.out.print("Enter the driver's CPF: ");
        String driverCPF = scanner.nextLine();
        Driver driver = this.searchDriver(driverCPF);
        if (driver == null) {
            System.out.print("Enter the driver's name: ");
            String driverName = scanner.nextLine();
            this.addDriver(driverCPF, driverName);
            return;
        }
        System.out.println("Driver already exists!");
    }

    public void addDriver(String name, String cpf) {
        this.drivers.add(new Driver(name, cpf));
    }

    public void searchDriverByCPF(String cpf) {
        System.out.print("Enter the driver's CPF: ");
        String driverCPF = scanner.nextLine();
        Driver driver = this.searchDriver(driverCPF);
        if (driver != null) {
            System.out.println(driver);
            return;
        }
        System.out.println("Driver not found!");
    }

    public Driver searchDriver(String cpf) {
        for (Driver driver : drivers) {
            if (driver.getCpf().equals(cpf)) {
                return driver;
            }
        }
        return null;
    }

    public void listDrivers() {
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }
}
