import java.util.ArrayList;
public class Cart {
    private ArrayList<Product> productsInArray;
    private final float tax;
    private Special special;

    public Cart(float tax, Special special) {
        this.productsInArray = new ArrayList<>();
        this.tax = tax;
        this.special = special;
    }
    public int cartQty() {
        int totalQuantity = 0;
        for (Product product : productsInArray) {
            totalQuantity += product.getInventory();
        }
        return totalQuantity;
    }
    public double subTotal() {
        double subtotal = 0;
        for (Product product : productsInArray) {
            subtotal += product.getPrice() * product.getInventory();
        }
        return subtotal;
    }
    public double totalAfterTax() {
        double timesTax = subTotal() * tax;
        double totalWithTax = subTotal() + timesTax;
        return totalWithTax;
    }
    public void addItem(Product product, int qty) {
        productsInArray.add(product);
    }

    public void removeItem(Product product, int qty) {
        productsInArray.remove(product);
    }
}
