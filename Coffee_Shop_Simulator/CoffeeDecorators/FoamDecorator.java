package Coffee_Shop_Simulator.CoffeeDecorators;

import Coffee_Shop_Simulator.Coffee.Coffee;

public class FoamDecorator extends CoffeeDecorator {
    public FoamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 150;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk Foam";
    }
}
