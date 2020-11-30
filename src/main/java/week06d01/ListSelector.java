package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {

    private List<String> text = new ArrayList<>();

    public String getEvenIndexParts(List<String> text) {
        StringBuilder result = new StringBuilder();
        if (text == null) {
            throw new IllegalArgumentException("I need real parameters instead of null!");
        }
        if (text.size()  !=0){
            result.append("[");
            result.append(text.get(0));
            for (int i = 2; i < text.size(); i += 2) {
                result.append(", " + text.get(i));
            }
            result.append("]");
        }
        return result.toString();
    }


}
