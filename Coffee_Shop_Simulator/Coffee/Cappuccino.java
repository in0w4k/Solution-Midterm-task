package Coffee_Shop_Simulator.Coffee;

public class Cappuccino implements Coffee{
    @Override
    public int getCost() {
        return 1300;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}
