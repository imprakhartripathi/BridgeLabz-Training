package generics.marketplace;

import generics.marketplace.impl.*;

public class Driver {
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Clean Code", 500, new BookCategory());

        DiscountUtil.applyDiscount(book, 10);
        System.out.println(book);
    }
}
