public class User {
    private final int id;
    private final int sharedID;
    private Cart cart;

    public User(int id, int sharedID) {
        this.id = id;
        this.sharedID = sharedID;
        initializeCart();
    }

    private void initializeCart() {

    }

    public int getId() {
        return id;
    }

    public int getSharedID() {
        return sharedID;
    }
    public void removeFromCart(Product product, int qty) {
        cart.removeItem(product, qty);
    }

    public void addToCart(Product product, int qty) {
        cart.addItem(product, qty);
    }
}