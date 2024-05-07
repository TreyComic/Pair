public class Soda extends Food implements Perishable {
    private static int inventory;

    public Soda(int id, int sharedID, String name, Size size, double price, int inventory) {
        super(id, sharedID, name, size, price, inventory);
        Soda.inventory = inventory; // Setting the static inventory field
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}