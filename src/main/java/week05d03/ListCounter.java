package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    public int aCounter(List<String> testList) {
        int counter = 0;
        for (int i = 0; i < testList.size(); i++) {
                if (testList.get(i).toLowerCase().startsWith("a")){
                    counter++;
                }
            }
        return counter;
        }
}

