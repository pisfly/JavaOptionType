package com.pisfly.test.code2;

public class Some<T> extends Result<T> {

    public Some(T obj) {
        object = obj;
    }

    public T get() throws NoValueException {
        return object;
    }

    public boolean isDefined() {
        return true;
    }
}
