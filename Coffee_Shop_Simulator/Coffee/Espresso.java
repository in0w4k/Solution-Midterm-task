package Coffee_Shop_Simulator.Coffee;

public class Espresso implements Coffee {
    @Override
    public int getCost() {
        return 900;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
