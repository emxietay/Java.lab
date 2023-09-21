package vn.funix.fx22541.lab15_1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.printf("Caught runtime exception = %s\n", e);
        }
    }
}
