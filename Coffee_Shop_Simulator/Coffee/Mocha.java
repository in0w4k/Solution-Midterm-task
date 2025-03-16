package Coffee_Shop_Simulator.Coffee;

public class Mocha implements Coffee {
    @Override
    public int getCost() {
        return 1500;
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }
}
