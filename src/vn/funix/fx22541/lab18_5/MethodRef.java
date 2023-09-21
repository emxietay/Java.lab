package vn.funix.fx22541.lab18_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRef {
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

        ArrayList<String> firstUpperCaseList = new ArrayList<>();
        topNames2015.forEach(name ->
                firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
//        firstUpperCaseList.sort((s, anotherString) -> s.compareTo(anotherString));
//        firstUpperCaseList.forEach(x -> System.out.println(x));
        firstUpperCaseList.sort(String::compareTo);
        firstUpperCaseList.forEach(System.out::println);


        System.out.println("----------------------------");
        topNames2015.stream()
                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }
}
