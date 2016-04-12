package com.jeremiemartinez.devoxx.truth;

import org.junit.Test;

public class CartTest {

    @Test
    public void should_add_remove_item() {
        Cart cart = generateCartWith3Items();

        cart.addItem(new Cart.Item(3L, "Item3", 10.0));

        // 1

        cart.removeItem(new Cart.Item(3L, "Item3", 10.0));

        // 2

    }

    @Test
    public void should_have_right_content() {
        Cart cart = generateCartWith3Items();

        // 3

    }

    @Test
    public void should_clear() {
        Cart cart = generateCartWith3Items();

        cart.clear();

        // 4

    }

    @Test
    public void should_count() {
        Cart cart = generateCartWith3Items();

        // 5

    }

    @Test
    public void should_compute_total() {
        Cart cart = generateCartWith3Items();

        // 6

    }

    private Cart generateCartWith3Items() {
        return new Cart( //
                new Cart.Item(1L, "Item1", 2.0), //
                new Cart.Item(2L, "Item2", 3.0), //
                new Cart.Item(2L, "Item2", 3.0) //
        );
    }

}