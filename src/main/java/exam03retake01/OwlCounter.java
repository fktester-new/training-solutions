package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlStat = new HashMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            loadMap(line);
        }
    }

    private void loadMap(String str) {
        String[] temp = str.split("=");
        owlStat.put(temp[0], Integer.parseInt(temp[1]));
    }

    public int getNumberOfOwls(String county) {
        for (String str : owlStat.keySet()) {
            if (county.equals(str)) {
                return owlStat.get(str);
            }
        }
        throw new IllegalArgumentException("invalid county name!");
    }
}
