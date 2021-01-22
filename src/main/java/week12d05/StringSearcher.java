package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringSearcher {

    public int countCovid(){

        int counter = 0;
        Path file = Path.of("index.html");
        try(BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while ((line = br.readLine()) != null){
                if (line.contains("Koronavírus") || line.contains("koronavírus")){
                    counter++;
                }
            }
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
        return counter;
    }

    public static void main(String[] args) {
        StringSearcher searcher = new StringSearcher();
        System.out.println(searcher.countCovid());
    }
}
