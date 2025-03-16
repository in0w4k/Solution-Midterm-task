package Coffee_Shop_Simulator.CoffeeDecorators;

import Coffee_Shop_Simulator.Coffee.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 250;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Whipped Cream";
    }
}
