package vn.funix.fx22541.lab16_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Util {
    public static void main(String[] args) {
        Path path = Path.of("d:\\");
        listLargeFile(path, 50L);
    }


    public static void listAnything(Path path) {
        try {
            if (Files.isReadable(path) && Files.isDirectory(path)) {
                System.out.println("Folder: " + path);

                Files.list(path).forEach(Util::listAnything);

                Files.list(path)
                        .filter(Files::isReadable)
                        .filter(Files::isRegularFile).peek(System.out::println)
                        .forEach(x -> {

                            try {
                                System.out.println("\tFILE: " + x + " " + (Files.size(x) / 1024) + " KiloBytes");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }

                        });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listLargeFile(Path path, long sizeInMB) {
        try {
            if (Files.isReadable(path) && Files.isDirectory(path)) {
//                System.out.println("Folder: " + path);

                Files.list(path).forEach(path1 -> listLargeFile(path1, sizeInMB));

                Files.list(path)
                        .filter(Files::isReadable)
                        .filter(Files::isRegularFile)
                        .filter(e -> {
                            try {
                                return Files.size(e) > (sizeInMB * 1024 * 1024);
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .forEach(x -> {

                            try {
                                System.out.println("\tFILE: " + x + " " + (Files.size(x) / 1024 / 1024) + " MegaBytes");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }

                        });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
