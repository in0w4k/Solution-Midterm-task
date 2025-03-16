package Coffee_Shop_Simulator.CoffeeDecorators;

import Coffee_Shop_Simulator.Coffee.Coffee;

public class VanillaSugarDecorator extends CoffeeDecorator {
    public VanillaSugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Vanilla Sugar";
    }
}
