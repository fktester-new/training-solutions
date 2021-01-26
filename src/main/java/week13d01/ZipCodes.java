package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ZipCodes {

    public String findTownWithLongestName() {
        Path file = Path.of("irszamok.csv");
        String result ="A";
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            String town;
            while ((line = reader.readLine()) != null) {
                town = townSelector(line);
                if (town.length() > result.length()) {
                    result = town;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }

    private String townSelector(String s){
        String town = s.substring(5);
        if (town.indexOf(";") == town.length()- 1){
                return town.substring(0, town.length() -1);
        }
        String[] parts = town.split(";");
        if (parts[0].length() > parts[1].length()){
            return parts[0];
        } else{
            return parts[1];
        }
    }

    public static void main(String[] args) {
        ZipCodes zipCodes = new ZipCodes();
        System.out.println(zipCodes.findTownWithLongestName());
    }
}
