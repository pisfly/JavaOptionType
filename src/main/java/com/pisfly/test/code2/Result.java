package com.pisfly.test.code2;

public abstract class Result<T> {

    T object;

    abstract public T get() throws NoValueException;

    abstract public boolean isDefined();

    public Result map(Function func) {

        if(isDefined()) {
            Object newObject = func.apply(object);
            return from(newObject);
        } else {
            return from(null);
        }
    }

    /**
     * Part 1:
     * Complete the following methods. You can modify the entire file.
     *
     * static method:
     *
     * from(value: AnyType) ->  None if null otherwise Some containing the value.
     * ex:
     *  String something = null;
     *  Result.from(something) -> None (for String type)
     *
     *
     * regular method:
     * isDefined() -> returns whether the result contains a value.
     * ex:
     *      Result.from(null).isDefined() -> false
     *
     * get() -> result value if Some, throws NoValueException if None
     * ex:
     *      Result.from("test").get() -> "test"
     *
     */

    public static Result from(Object value) {

        if(value == null) {
            return new None();
        } else {
            return new Some(value);
        }
    }


    /**
     *  Part 2
     * Complete the method below
     *
     * instance method
     * map(function: com.ubicast.test.code2.Function of type contained in Result to another type) -> Result of another type
     *
     * ex:
     *      //stringToInt is a com.ubicast.test.code2.Function that converts a string to an integer.
     *      Result.from("1").map(stringToInt).get() -> 1
     */


}
