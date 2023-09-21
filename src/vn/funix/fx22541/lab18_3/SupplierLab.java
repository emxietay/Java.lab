package vn.funix.fx22541.lab18_3;

import java.util.function.Supplier;

public class SupplierLab {
    public static void main(String[] args) {
        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }
}
