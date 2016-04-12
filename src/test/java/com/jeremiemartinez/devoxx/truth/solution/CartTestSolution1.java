package com.jeremiemartinez.devoxx.truth.solution;

import com.jeremiemartinez.devoxx.truth.Cart;
import org.junit.Test;

import static com.google.common.truth.Truth.assert_;

public class CartTestSolution1 {

    @Test
    public void should_add_remove_item() {
        Cart cart = generateCartWith3Items();

        cart.addItem(new Cart.Item(3L, "Item3", 10.0));

        assert_().that(cart.count()).isEqualTo(4);
        assert_().that(cart.total()).isAtLeast(18.0);

        cart.removeItem(new Cart.Item(3L, "Item3", 10.0));

        assert_().that(cart.count()).isEqualTo(3);
        assert_().that(cart.total()).isAtLeast(8.0);
    }

    @Test
    public void should_have_right_content() {
        Cart cart = generateCartWith3Items();

        assert_().that(cart.content()).containsKey(new Cart.Item(1L, "Item1", 2.0f));
    }

    @Test
    public void should_clear() {
        Cart cart = generateCartWith3Items();

        cart.clear();

        assert_().that(cart.count()).isEqualTo(0);
        assert_().that(cart.total()).isAtLeast(0.0);
    }

    @Test
    public void should_count() {
        Cart cart = generateCartWith3Items();

        assert_().that(cart.count()).isEqualTo(3);
    }

    @Test
    public void should_compute_total() {
        Cart cart = generateCartWith3Items();

        assert_().that(cart.total()).isAtLeast(8.0);
    }

    private Cart generateCartWith3Items() {
        return new Cart( //
                new Cart.Item(1L, "Item1", 2.0), //
                new Cart.Item(2L, "Item2", 3.0), //
                new Cart.Item(2L, "Item2", 3.0) //
        );
    }
}