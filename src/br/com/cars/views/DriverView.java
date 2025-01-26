package br.com.cars.views;

import br.com.cars.menus.*;
import br.com.cars.modules.ModuleDriver;
import java.util.Scanner;

public class DriverView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        String option = "";

        do {
            Menus.driverMenu();
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    ModuleDriver.registerDriver();
                    break;

                case "2":
                    ModuleDriver.searchDriverByCPF();
                    break;

                case "3":
                    ModuleDriver.listDrivers();
                    break;

                case "0":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        } while (!option.equals("0"));
    }
}
