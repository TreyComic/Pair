public class Hat extends Clothing {
    private static int inventory;
    public Hat(int id, int sharedID, String name, Size size, double price, int inventory) {
        super(id, sharedID, name, size, price, inventory);
        Hat.inventory = inventory;
    }
}
