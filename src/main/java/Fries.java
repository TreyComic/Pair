public class Fries extends Food implements Perishable {
    private static int inventory;
    public Fries(int id, int sharedID, String name, Size size, double price, int inventory) {
        super(id, sharedID, name, size, price, inventory);
        Fries.inventory = inventory;
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}
