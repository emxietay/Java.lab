package vn.funix.fx22541.lab18_2;

import java.util.function.Function;

public class Lamda2 {
    public static void main(String[] args) {


        Function<String, String> lamdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 0) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        String s = "1234567890";
        System.out.println(lamdaFunction.apply(s));
        System.out.println(everySecondChar(lamdaFunction, s));

    }

    public static String everySecondChar(Function<String, String> function, String s) {
        return function.apply(s);
    }
}
