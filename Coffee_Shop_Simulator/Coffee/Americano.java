package Coffee_Shop_Simulator.Coffee;

public class Americano implements Coffee {
    @Override
    public int getCost() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}
