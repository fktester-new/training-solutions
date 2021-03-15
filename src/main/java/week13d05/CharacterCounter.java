package week13d05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterCounter {

    public int countNumberOfDifferentCharacters(String text){

        if (text == null || text.isBlank()){
            throw new IllegalArgumentException("The string is empty or null");
        }
        char[] characters  = text.toLowerCase().toCharArray();
        Set<Character> result = new HashSet<>();

        for (Character c : characters){
            if (isValidCharacter(c)){
                result.add(c);
            }
        }
        return result.size();
    }

    public int countCharactersInMap(String word){
        if (word == null || word.isBlank()){
            throw new IllegalArgumentException("The string is empty or null");
        }
        char[] characters  = word.toLowerCase().toCharArray();
        Map<Character, Integer> result = new HashMap<>();
        for (Character c : characters) {
            if (isValidCharacter(c)){
                addToMap(result, c);
            }
        }
        return result.size();
    }

    private boolean isValidCharacter(char c){
        return ('a' <= c && c <= 'z');
    }

    private void addToMap(Map<Character, Integer> map, Character c){
        if (map.containsKey(c)){
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
    }
}
