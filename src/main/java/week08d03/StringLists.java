package week08d03;

import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> result = first;
        for (String string: second) {
            if (!result.contains(string)){
                result.add(string);
            }
        }
        return result;
    }
}
