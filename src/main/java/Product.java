public class Product {
    private final int id;
    private static int sharedID;
    private String name;
    private Size size;
    private double price;
    private int inventory;

    public Product(int id, int sharedID, String name, Size size, double price, int inventory) {
        this.id = id;
        this.sharedID = sharedID;
        this.name = name;
        this.size = size;
        this.price = price;
        this.inventory = inventory;
    }

    public int getId() {
        return id;
    }

    public int getSharedID() {
        return sharedID;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}

