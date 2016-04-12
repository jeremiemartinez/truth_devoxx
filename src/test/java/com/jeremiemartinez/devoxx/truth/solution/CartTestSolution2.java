package com.jeremiemartinez.devoxx.truth.solution;

import com.jeremiemartinez.devoxx.truth.Cart;
import org.junit.Test;

import static com.google.common.truth.Truth.assert_;
import static com.jeremiemartinez.devoxx.truth.solution.CartSubjectSolution.cart;

public class CartTestSolution2 {

    @Test
    public void should_add_remove_item() {
        Cart cart = generateCartWith3Items();

        cart.addItem(new Cart.Item(3L, "Item3", 10.0f));

        assert_().about(cart()).that(cart).hasCount(4).hasTotal(18f);

        cart.removeItem(new Cart.Item(3L, "Item3", 10.0f));

        assert_().about(cart()).that(cart).hasCount(3).hasTotal(8f);
    }

    @Test
    public void should_have_right_content() {
        Cart cart = generateCartWith3Items();

        assert_().about(cart()).that(cart).contains(1L);
    }

    @Test
    public void should_clear() {
        Cart cart = generateCartWith3Items();

        cart.clear();

        assert_().about(cart()).that(cart).isEmpty().hasTotal(0f);
    }

    @Test
    public void should_count() {
        Cart cart = generateCartWith3Items();

        assert_().about(cart()).that(cart).hasCount(3);
    }

    @Test
    public void should_compute_total() {
        Cart cart = generateCartWith3Items();

        assert_().about(cart()).that(cart).hasTotal(8f);
    }

    private Cart generateCartWith3Items() {
        return new Cart( //
                new Cart.Item(1L, "Item1", 2.0), //
                new Cart.Item(2L, "Item2", 3.0), //
                new Cart.Item(2L, "Item2", 3.0) //
        );
    }
}