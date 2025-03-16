package Coffee_Shop_Simulator.CoffeeDecorators;

import Coffee_Shop_Simulator.Coffee.Coffee;

public class ChocolateSyrupDecorator extends CoffeeDecorator {
    public ChocolateSyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 300;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Chocolate Syrup";
    }
}
