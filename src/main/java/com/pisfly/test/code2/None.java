package com.pisfly.test.code2;

public class None<T> extends Result<T> {

    public T get() throws NoValueException {
        throw new NoValueException();
    }

    public boolean isDefined() {
        return false;
    }
}
