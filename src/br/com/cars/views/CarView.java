package br.com.cars.views;

import br.com.cars.menus.Menus;
import br.com.cars.modules.ModuleCar;

import java.util.Scanner;

public class CarView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        do {
            Menus.carMenu();
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    ModuleCar.registerCar();
                    break;

                case "2":
                    ModuleCar.searchCarForPlate();
                    break;

                case "3":
                    ModuleCar.linkDriver();
                    break;

                case "4":
                    ModuleCar.listCars();
                    break;

                case "5":
                    ModuleCar.listCarsByCPF();
                    break;

                case "0":
                    System.out.println("Exiting...");
                    return;
            }
        } while (true);
    }
}
