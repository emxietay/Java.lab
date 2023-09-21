package vn.funix.fx22541.lab13_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class UtilitiesTest {

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        fail("This test has not been implemented yet");
    }

    @org.junit.jupiter.api.Test
    void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("ABBCDEEF"));
    }

    @org.junit.jupiter.api.Test
    void removePairs2() {
        Utilities util = new Utilities();
        assertEquals("ABCBDEF", util.removePairs("ABCBDEEF "));
    }

    @org.junit.jupiter.api.Test
    void converter() {
        fail("This test has not been implemented yet");
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength() {
        fail("This test has not been implemented yet");
    }
}