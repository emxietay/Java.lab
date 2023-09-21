package vn.funix.fx22541.lab15_2;

public class InvalidDiceException extends RuntimeException {
    public InvalidDiceException(String message) {
        super(message);
    }
}

class NumberRollDiceNotEqualException extends RuntimeException {
    public NumberRollDiceNotEqualException(String message) {
        super(message);
    }
}
