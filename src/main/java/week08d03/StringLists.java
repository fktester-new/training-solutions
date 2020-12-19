package week08d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> result = new ArrayList<>();
                result.addAll(first);
        for (String string: second) {
            if (!result.contains(string)){
                result.add(string);
            }
        }
        return result;
    }

    private boolean containsIgnoreCase(List<String> words, String element){
        for (String s: words) {
            if (s.toUpperCase().equals(element.toUpperCase())){
                return true;
            }
        }
        return false;
    }

    public List<String> stringListsUnionIgnoreCase(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        result.addAll(first);
        for (String str: second) {
            if (!containsIgnoreCase(result, str)){
                result.add(str);
            }
        }
        return result;
    }
}
