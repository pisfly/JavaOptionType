package com.pisfly.test.code2;

import org.junit.Test;


import static org.junit.Assert.*;

public class ResultTests {


    //TESTS PART 1


    @Test
    public void testResultMarshalsCorrectly() throws NoValueException {
        Result<String> result = Result.from("test");
        assertTrue(result.get() instanceof String);
    }


    @Test(expected = NoValueException.class)
    public void testNoneThrowsException() throws NoValueException {
        Result<String> result = Result.from(null);
        result.get();
    }

    @Test
    public void testNoneMarshalsCorrectly(){
        Result<String> result = Result.from(null);
        assertFalse(result.isDefined());
    }


    //TESTS PART 2


    private static final Function<String, Integer> toInteger = new Function<String, Integer>() {
        public Integer apply(String value) {
            return Integer.valueOf(value);
        }
    };

    @Test
    public void testSomeConversion() throws NoValueException {
        Result<String> result = Result.from("1");
        Result<Integer> convertedResult = result.map(toInteger);
        assertTrue(convertedResult.get() instanceof Integer);
    }

    @Test
    public void testNoneConversion() {
        Result<String> result = Result.from(null);
        Result<Integer> convertedResult = result.map(toInteger);
        assertFalse(convertedResult.isDefined());
    }



}
