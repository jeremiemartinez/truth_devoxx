package com.jeremiemartinez.devoxx.truth;

import org.junit.Test;

public class CartTest {

    @Test
    public void should_count() {
        Cart cart = generateCartWith3Items();

        // 1

    }

    @Test
    public void should_compute_total() {
        Cart cart = generateCartWith3Items();

        // 2

    }

    @Test
    public void should_add_remove_item() {
        Cart cart = generateCartWith3Items();

        cart.addItem(new Cart.Item(3L, "Item3", 10));

        // 3

        cart.removeItem(new Cart.Item(3L, "Item3", 10));

        // 4

    }

    @Test
    public void should_clear() {
        Cart cart = generateCartWith3Items();

        cart.clear();

        // 5

    }

    private Cart generateCartWith3Items() {
        return new Cart( //
                new Cart.Item(1L, "Item1", 2), //
                new Cart.Item(2L, "Item2", 3), //
                new Cart.Item(2L, "Item2", 3) //
        );
    }

}