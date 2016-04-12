package com.jeremiemartinez.devoxx.truth;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

public class CartSubject extends Subject<CartSubject, Cart> {

    private static final SubjectFactory<CartSubject, Cart> FACTORY = new SubjectFactory<CartSubject, Cart>() {
        @Override
        public CartSubject getSubject(FailureStrategy fs, Cart target) {
            return new CartSubject(fs, target);
        }
    };

    public static SubjectFactory<CartSubject, Cart> cart() {
        return FACTORY;
    }

    public CartSubject(FailureStrategy failureStrategy, Cart subject) {
        super(failureStrategy, subject);
    }

    public CartSubject hasCount(int count) {

    }

    public CartSubject isEmpty() {

    }

    public CartSubject hasTotal(float total) {

    }

    public CartSubject contains(long id) {

    }
}
