package vn.funix.fx22541.lab16_1;

import java.nio.file.Path;

import static vn.funix.fx22541.lab16_1.Util.listAnything;
import static vn.funix.fx22541.lab16_1.Util.listLargeFile;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("C:\\");
        listAnything(path);
        listLargeFile(path, 500L);
    }
}
