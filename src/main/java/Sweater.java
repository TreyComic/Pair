public class Sweater extends Clothing {
    private static int inventory;

    public Sweater(int id, int sharedID, String name, Size size, double price, int inventory) {
        super(id, sharedID, name, size, price, inventory);
        Sweater.inventory = inventory;
    }
}