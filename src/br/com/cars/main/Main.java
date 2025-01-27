package br.com.cars.main;

import java.util.Scanner;
import br.com.cars.menus.Menus;
import br.com.cars.views.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            Menus.mainMenu();
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    DriverView.start();
                    break;

                case "2":
                    CarView.start();
                    break;

                case "3":
                    SupplyView.start();
                    break;

                case "0":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        } while (true);
    }
}
