import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void subTotal() {
        void testSubTotal () {
            // Create a test user
            User user = new User(1, 1001);
            // Create some products
            Product product1 = new Fries(1, 1001, "French Fries", Size.SMALL, 5.0, 2);
            // Add products to the cart
            user.addToCart(product1, 2);
            // Create a cart for the user
            // Calculate the expected subtotal
            double expectedSubTotal = (product1.getPrice() * product1.getInventory());
        }
    }
}