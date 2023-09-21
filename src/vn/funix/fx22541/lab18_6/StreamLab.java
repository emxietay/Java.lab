package vn.funix.fx22541.lab18_6;

import java.util.Arrays;
import java.util.List;

public class StreamLab {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        long number = topNames2015.stream()
                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("-------------------\n" + number);

//                .forEach(System.out::println);

    }
}
