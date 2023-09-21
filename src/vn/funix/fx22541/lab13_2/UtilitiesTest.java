package vn.funix.fx22541.lab13_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void everyNthChar() {
        Utilities util = new Utilities();
        char[] sourceArray = {'h', 'e', 'l', 'l', 'o'};
        char[] assertedResult = {'e', 'l'};
        assertArrayEquals(assertedResult, util.everyNthChar(sourceArray, 2));
    }

    @Test
    void everyNthChar2() {
        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 10);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output);
    }


    @Test
    void removePairs() {
    }

    @Test
    void converter() {
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));
    }

    @Test
    void nullIfOddLength() {
        Utilities util = new Utilities();
        assertNotNull(util.nullIfOddLength("12"));
    }

    @Test
    void nullIfOddLength2() {
        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("123"));
    }
}