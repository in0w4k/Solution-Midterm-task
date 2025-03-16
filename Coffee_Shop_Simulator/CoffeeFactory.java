package Coffee_Shop_Simulator;

import Coffee_Shop_Simulator.Coffee.*;

public class CoffeeFactory {
    public Coffee createCoffee(String coffee) {
        return switch (coffee.trim().toLowerCase()) {
            case "latte" -> new Latte();
            case "cappuccino" -> new Cappuccino();
            case "raff" -> new Raff();
            case "macchiato" -> new Macchiato();
            case "americano" -> new Americano();
            case "espresso" -> new Espresso();
            case "mocha" -> new Mocha();
            default -> null;
        };
    }
}
