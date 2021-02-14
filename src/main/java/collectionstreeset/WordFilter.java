package collectionstreeset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings){
        List<String> temp = Arrays.asList(randomStrings);

        Set<String> sortedWords = new TreeSet<String>(temp);
        return sortedWords;
    }
}
