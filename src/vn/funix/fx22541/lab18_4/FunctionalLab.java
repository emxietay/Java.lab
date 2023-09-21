package vn.funix.fx22541.lab18_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class FunctionalLab {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

        List<String> a = List.of("a", "b", "c");
        ArrayList<String> strings = new ArrayList<>(a);
        strings.sort(stringComparator);
    }
}
