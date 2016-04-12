package com.jeremiemartinez.devoxx.truth;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    public CartSubject isEmpty() {
        throw new NotImplementedException();
    }

    public CartSubject hasTotal(float total) {
        throw new NotImplementedException();
    }
}
