package vn.funix.fx22541.lab15_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Integer> bobDices = readDices("bob.txt");
            System.out.println(bobDices);

            List<Integer> aliceDices = readDices("alice.txt");
            System.out.println(aliceDices);

            String winner = getWinner(bobDices, aliceDices);
            if (winner == null) {
                System.out.println("Two people have equal points");
            } else {
                System.out.println("The winner is: " + winner);
            }
        } catch (InvalidDiceException | NumberRollDiceNotEqualException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("The file contain non numeric data");
        }
    }

    public static List<Integer> readDices(String fileName) throws FileNotFoundException, InputMismatchException {
        System.out.println("Read file: " + fileName);
        Scanner scanner = null;
        List<Integer> dices = new ArrayList<>();
        try {
            scanner = new Scanner(new FileReader(fileName));
            while (scanner.hasNextLine()) {
                int dice = scanner.nextInt();
                if (dice < 0) {
                    throw new InvalidDiceException("Dice value must greater than zero");
                } else if (dice > 6) {
                    throw new InvalidDiceException("Dice value must less than or equal to six");
                } else {
                    dices.add(dice);
                }

            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return dices;
    }

    public static String getWinner(List<Integer> bobDices, List<Integer> aliceDices) {
        if (bobDices.size() != aliceDices.size()) {
            throw new NumberRollDiceNotEqualException("Number of dice rolls not equal");
        }
        Integer sumBob = sumOfDice(bobDices);
        Integer sumAlice = sumOfDice(aliceDices);
        if (Objects.equals(sumBob, sumAlice)) {
            return null;
        } else if (sumBob > sumAlice) {
            return "Bob";
        } else {
            return "Alice";
        }

    }

    private static Integer sumOfDice(List<Integer> bobDices) {
        return bobDices.stream().mapToInt(Integer::intValue).sum();
    }
}

















