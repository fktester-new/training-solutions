package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {

    public String createHistogram(BufferedReader br){
        StringBuilder result = new StringBuilder();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                int i = Integer.parseInt(line.trim());
                for (int j = 0; j < i; j++){
                    result.append("*");
                }
                result.append("\n");
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Cannot read file!", ioe);
        }
        return result.toString();
    }



}
