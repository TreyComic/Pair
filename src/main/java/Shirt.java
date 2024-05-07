public class Shirt extends Clothing {
    private static int inventory;

    public Shirt(int id, int sharedID, String name, Size size, double price, int inventory) {
        super(id, sharedID, name, size, price, inventory);
        Shirt.inventory = inventory;
    }
}