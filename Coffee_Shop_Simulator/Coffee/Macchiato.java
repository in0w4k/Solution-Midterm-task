package Coffee_Shop_Simulator.Coffee;

public class Macchiato implements Coffee {
    @Override
    public int getCost() {
        return 1100;
    }

    @Override
    public String getDescription() {
        return "Macchiato";
    }
}
