package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){
        Map<Character, List<String>> result = new HashMap<>();
        char c;
        for (String name : names) {
            c = name.charAt(0);
            if (!result.containsKey(c)){
                result.put(c, new ArrayList<>());
            }
            result.get(c).add(name);
            }
        return result;
        }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna", "Lajos")));
    }
}
