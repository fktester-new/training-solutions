package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {

    public Map<String, Integer> wordCounter(BufferedReader br, String... words) {

        Map<String, Integer> result;
        try {
            result = processLine(br, words);
        } catch (IOException e) {
            throw new IllegalArgumentException("Exception when reading file!", e);
        }
        return result;
    }

    private void modifyMap(Map<String, Integer> result, String line, String word) {
        if (line.toLowerCase().contains(word.toLowerCase())) {
            int count = result.get(word);
            result.put(word, count + 1);
        }
    }


    private Map<String, Integer> processLine(BufferedReader br, String[] words) throws IOException{
        Map<String, Integer> result=loadMap(words);
        String line;
        while((line=br.readLine())!=null) {
            System.out.println(line);
            for (String word : words) {
                modifyMap(result, line, word);
            }
        }
        return result;
    }

        private Map<String, Integer> loadMap (String[]words){
            Map<String, Integer> result = new HashMap<>();
            for (String word : words) {
                result.put(word, 0);
            }
            return result;
        }

        public static void main (String[]args){
            try (BufferedReader br = Files.newBufferedReader(Path.of("hachiko.srt"), Charset.forName("windows-1250"))) {
                Hachiko hachiko = new Hachiko();
                System.out.println(hachiko.wordCounter(br, "Hachiko", "pályaudvar", "jó", "haza"));
            } catch (IOException e) {
                throw new IllegalArgumentException("Exception when loading file", e);
            }
        }
    }
