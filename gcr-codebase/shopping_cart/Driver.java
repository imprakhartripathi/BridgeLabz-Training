package shopping_cart;

import shopping_cart.impl.CartService;

public class Driver {
    public static void main(String[] args) {

        CartService cart = new CartService();

        cart.addProduct("Laptop", 60000);
        cart.addProduct("Mouse", 1500);
        cart.addProduct("Keyboard", 3000);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Keyboard", 1);

        cart.printCartInInsertionOrder();

        System.out.println("\nTotal Amount: ₹" + cart.calculateTotal());

        System.out.println();
        cart.printCartSortedByPrice();
    }
}
