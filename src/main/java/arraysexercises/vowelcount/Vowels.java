package arraysexercises.vowelcount;

import java.util.HashMap;
import java.util.Map;

public class Vowels {

    protected static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static int[] vowelCount(String str){
        int[] vowelCounter;
        char[] temp = str.toLowerCase().toCharArray();
        Map<Character, Integer> result = initMap();
        for (char c : temp) {
            if (isVowel(c)){
                result.put(c, result.get(c) + 1);
            }
        }
        vowelCounter = mapToArray(result);
        return vowelCounter;
    }

    private static int[] mapToArray(Map<Character, Integer> result) {
        int[] temp = new int[5];
        temp[0] = result.get('a');
        temp[1] = result.get('e');
        temp[2] = result.get('i');
        temp[3] = result.get('o');
        temp[4] = result.get('u');

        return temp;
    }

    private static boolean isVowel(char c) {
        for (char ch : VOWELS) {
            if (c == ch){
                return true;
            }
        }
        return false;
    }

    private static Map<Character, Integer> initMap() {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : VOWELS) {
            result.put(c, 0);
        }
        return result;
    }

        public static int[] vowelCountOther(String str){
            int[] vowelCounter = new int[5];
            char[] temp = str.toLowerCase().toCharArray();
            
            vowelCounter[0] = Vowels.countChar(temp, 'a');
            vowelCounter[1] = Vowels.countChar(temp, 'e');
            vowelCounter[2] = Vowels.countChar(temp, 'i');
            vowelCounter[3] = Vowels.countChar(temp, 'o');
            vowelCounter[4] = Vowels.countChar(temp, 'u');

            return vowelCounter;

        }

    private static int countChar(char[] arr, char c) {
        int counter = 0;
        for (char ch : arr) {
            if (ch == c){
                counter++;
            }
        }
        return counter;
    }
}
