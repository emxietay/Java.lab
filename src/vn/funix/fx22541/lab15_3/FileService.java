package vn.funix.fx22541.lab15_3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FileService<T> {
    public FileService() {
    }

    public void printList(Set<T> companies) {
        companies.forEach(System.out::println);
    }

    public Set<T> readFile(String fileName) {
        Set<T> objects = new HashSet<>();
        try (ObjectInputStream file = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            boolean eof = false;
            while (!eof) {
                try {
                    T object = (T) file.readObject();
                    objects.add(object);
                } catch (IOException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Exception " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }
        return objects;
    }

    public void writeListToFile(String fileName, Set<T> objects) {
        Set<T> listObject = readFile(fileName);

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            for (T object : objects) {
                oos.writeObject(object);
                System.out.println("Just write " + object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeObjectToFile(String fileName, T object) {
        Set<T> listObject = readFile(fileName);

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            if (!listObject.contains(object)) {
                oos.writeObject(object);
                System.out.println("Just write " + object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
