package vn.funix.fx22541.lab13_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UtilitiesTest {


    private Utilities util;

    @BeforeEach
    void setUp() {
        util = new Utilities();
    }

    @Test
    void everyNthChar() {
    }

    @Test
    void removePairs() {
    }

    @Test
    public void converter_ArithmeticException() {
        assertThrows(ArithmeticException.class,
                () -> util.converter(10, 0));

    }

    @Test
    void nullIfOddLength() {
    }

}