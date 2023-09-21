package vn.funix.fx22541.lab16_2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean checkFileNameValid(String fileName) {
        Pattern p = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[0-2])\\-(0?[1-9]|[12][0-9]|3[01]).(.txt)$");
        Matcher m = p.matcher(fileName);
        return m.matches();
    }

    public static Map<String, List<String>> readFileInFolderToMap(String rootFolder) {
        Map<String, List<String>> folderMap = new HashMap<>();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(rootFolder))) {
            for (Path path : stream) {
                System.out.print("Check item: " + path.getFileName());
                if (!Files.isDirectory(path)) {
                    String fileName = path.getFileName().toString();
                    if (checkFileNameValid(fileName)) {
                        System.out.println("---File valid!");
                        String newFolder = fileName.substring(0, fileName.lastIndexOf("-"));
                        List<String> listFileInFolder = new ArrayList<>();
                        if (folderMap.containsKey(newFolder)) {
                            listFileInFolder = folderMap.get(newFolder);
                        }
                        listFileInFolder.add(fileName);
                        folderMap.put(newFolder, listFileInFolder);
                    } else {
                        System.out.println("=== File invalid will be removed!");
                        Files.delete(path);
                    }
                } else {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return folderMap;
    }

    public static void createFolderAndMoveFile(String rootFolder, Map<String, List<String>> folderMap) {
        for (String newFolder : folderMap.keySet()) {
            Path newFolderPath = Paths.get(rootFolder, newFolder);
            try {
                Files.createDirectory(newFolderPath);
                for (String fileName : folderMap.get(newFolder)) {
                    Path oldFilePath = Paths.get(rootFolder, fileName);
                    Path newFilePath = newFolderPath.resolve(fileName);
                    Files.move(oldFilePath, newFilePath);
                    System.out.println("Move file: " + oldFilePath + " ====> : " + newFilePath);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> folderMap = readFileInFolderToMap("2022Copy");
        createFolderAndMoveFile("2022Copy", folderMap);
    }
}
