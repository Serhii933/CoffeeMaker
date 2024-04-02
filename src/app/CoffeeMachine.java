package app;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("Choose a drink:");
        System.out.println("1 - Espresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Latte");
    }

    public static int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void prepareDrink(int choice) {
        Beverage beverage;
        switch (choice) {
            case 1:
                beverage = new Espresso();
                break;
            case 2:
                beverage = new Cappuccino();
                break;
            case 3:
                beverage = new Latte();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid drink.");
                return;
        }
        beverage.make();
    }
}

