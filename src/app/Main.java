package app;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine.displayMenu();
        int choice = CoffeeMachine.getUserChoice();
        CoffeeMachine.prepareDrink(choice);
    }
}

