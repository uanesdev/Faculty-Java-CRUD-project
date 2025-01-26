package br.com.cars.menus;

public class Menus {
    public static void mainMenu() {
        System.out.println(" - Main Menu - ");
        System.out.println("1 - Driver Menu");
        System.out.println("2 - Car Menu");
        System.out.println("0 - Exit");
        System.out.print("Enter your choice: ");
    }

    public static void driverMenu() {
        System.out.println("\n - Driver Menu - ");
        System.out.println("1 - Register Driver");
        System.out.println("2 - Search for CPF");
        System.out.println("3 - List Drivers");
        System.out.println("0 - Exit Menu");
        System.out.print("Enter your choice: ");
    }

    public static void carMenu() {
        System.out.println("\n - Car Menu - ");
        System.out.println("1 - Register Car");
        System.out.println("2 - Search for plate");
        System.out.println("3 - Link Drivers");
        System.out.println("4 - List Cars");
        System.out.println("5 - List Cars by CPF");
        System.out.println("0 - Exit Menu");
        System.out.print("Enter your choice: ");

    }
}
