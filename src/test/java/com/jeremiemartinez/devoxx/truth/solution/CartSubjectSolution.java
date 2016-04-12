package com.jeremiemartinez.devoxx.truth.solution;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;
import com.jeremiemartinez.devoxx.truth.Cart;

public class CartSubjectSolution extends Subject<CartSubjectSolution, Cart> {

    private static final SubjectFactory<CartSubjectSolution, Cart> FACTORY
            = new SubjectFactory<CartSubjectSolution, Cart>() {
        @Override
        public CartSubjectSolution getSubject(FailureStrategy fs, Cart target) {
            return new CartSubjectSolution(fs, target);
        }
    };

    public static SubjectFactory<CartSubjectSolution, Cart> cart() {
        return FACTORY;
    }

    public CartSubjectSolution(FailureStrategy failureStrategy, Cart subject) {
        super(failureStrategy, subject);
    }

    public CartSubjectSolution isEmpty() {
        return hasCount(0);
    }

    public CartSubjectSolution hasCount(int count) {
        if (getSubject().count() != count) {
            fail("hasCount", count);
        }
        return this;
    }

    public CartSubjectSolution hasTotal(int total) {
        if (getSubject().total() != total) {
            fail("hasTotal", total);
        }
        return this;
    }
}
