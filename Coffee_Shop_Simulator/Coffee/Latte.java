package Coffee_Shop_Simulator.Coffee;

public class Latte implements Coffee {
    @Override
    public int getCost() {
        return 1200;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
