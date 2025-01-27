package br.com.cars.views;

import br.com.cars.menus.Menus;
import br.com.cars.modules.ModuleSupply;

import java.util.Scanner;

public class SupplyView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        do {
            Menus.supplyMenu();
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    ModuleSupply.registerSupply();
                    break;

                case "2":
                    ModuleSupply.listSupplys();
                    break;

                case "0":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        } while (true);
    }
}
