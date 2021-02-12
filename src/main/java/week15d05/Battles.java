package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class Battles {

    private Map<String, Integer> housesStat = new HashMap<>();

    public void readFromFile(BufferedReader br) {
        try {
            String line;
            br.readLine(); // A fejléc beolvasása.
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Fail at reading!");
        }
    }

    private void processLine(String line) {
        String[] temp = line.split(",");

        for (int i = 4; i < 12; i++) {
            if (!temp[i].isEmpty()) {
                putMap(temp[i]);
            }
        }
    }

    private void putMap(String house) {
        if (!housesStat.containsKey(house)) {
            housesStat.put(house, 1);
        }
        housesStat.put(house, housesStat.get(house) + 1);
    }

    public String sortedData() {
        Set<Battle> sortedData = new TreeSet<>(Comparator.comparingInt(Battle::getNumber).reversed());
        for (String key : housesStat.keySet()) {
            sortedData.add(new Battle(key, housesStat.get(key)));
        }
        return sortedData.iterator().next().getHouse();
    }

    public Map<String, Integer> getHousesStat() {
        return new HashMap<>(housesStat);
    }

    public static void main(String[] args) {
        Battles battle = new Battles();
        try (BufferedReader br = Files.newBufferedReader(Path.of("battles.csv"))) {
            battle.readFromFile(br);
            System.out.println(battle.getHousesStat().size());
            System.out.println(battle.sortedData());
        } catch (IOException e) {
            throw new IllegalArgumentException("Exception when loading file", e);
        }
    }
}
