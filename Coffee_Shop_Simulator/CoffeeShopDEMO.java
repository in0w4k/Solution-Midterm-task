package Coffee_Shop_Simulator;

import Coffee_Shop_Simulator.Coffee.Coffee;
import Coffee_Shop_Simulator.CoffeeDecorators.*;

import java.util.Scanner;

public class CoffeeShopDEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = null;

        //Choosing coffee
        System.out.println("Choose coffee that you want: ");
        System.out.println("1. Latte\n2. Cappuccino\n3. Raff\n4. Macchiato\n5. Americano\n6. Espresso\n7. Mocha");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> coffee = coffeeFactory.createCoffee("Latte");
            case 2 -> coffee = coffeeFactory.createCoffee("Cappuccino");
            case 3 -> coffee = coffeeFactory.createCoffee("Raff");
            case 4 -> coffee = coffeeFactory.createCoffee("Macchiato");
            case 5 -> coffee = coffeeFactory.createCoffee("Americano");
            case 6 -> coffee = coffeeFactory.createCoffee("Espresso");
            case 7 -> coffee = coffeeFactory.createCoffee("Mocha");
            default -> {
                System.out.println("Invalid choice!");
                sc.close();
                return;
            }
        }

        //Showing order and price of coffee
        System.out.println("Your order " + coffee.getDescription());
        System.out.println("Price: " + coffee.getCost() + "₸");

        //Adding toppings
        System.out.print("Do you want to add any toppings? (y/n): ");
        String choice2 = sc.next();

        if (choice2.equalsIgnoreCase("y")) {
            while (true) {
                System.out.println("\nEnter toppings:");
                System.out.println("1. Milk (+200₸)\n2. Milk foam (+150₸)\n3. Cream (+250₸)\n4.Vanilla sugar (+100₸)" +
                        "\n5. Water (+50₸)\n6. Chocolate syrup (+300₸)\n7. Caramel syrup (+350₸)\n8. Whipped cream (+250₸)" +
                        "\n0. Exit"
                );
                System.out.print("Enter your choice: ");
                int choice3 = sc.nextInt();

                if (choice3 == 0) {
                    break;
                }

                switch (choice3) {
                    case 1 -> coffee = new MilkDecorator(coffee);
                    case 2 -> coffee = new FoamDecorator(coffee);
                    case 3 -> coffee = new CreamDecorator(coffee);
                    case 4 -> coffee = new VanillaSugarDecorator(coffee);
                    case 5 -> coffee = new WaterDecorator(coffee);
                    case 6 -> coffee = new ChocolateSyrupDecorator(coffee);
                    case 7 -> coffee = new CaramelSyrupDecorator(coffee);
                    case 8 -> coffee = new WhippedCreamDecorator(coffee);
                    default -> System.out.println("Invalid choice!");
                }

                System.out.println("Current order " + coffee.getDescription());
                System.out.println("Current price: " + coffee.getCost() + "₸");
            }
        }

        //Showing final order and price
        System.out.println("\nYour final order: " + coffee.getDescription());
        System.out.println("Total price: " + coffee.getCost() + "₸");
        sc.close();
    }
}
