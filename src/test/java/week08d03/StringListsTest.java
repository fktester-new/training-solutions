package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void stringListsUnionTest(){

        StringLists stringLists = new StringLists();
        List<String> first = new ArrayList<>();
        first.add("aa");
        first.add("bb");
        first.add("cc");
        first.add("dd");

        List<String> second = Arrays.asList("bb", "dd", "ee", "ff");

        List<String> result = new ArrayList<>();
        result.addAll(first);
        result.add("ee");
        result.add("ff");

        assertEquals(result, stringLists.stringListsUnion(first, second));
    }

    @Test
    public void stringListsUnionIgnoreCaseTest(){
        StringLists stringLists = new StringLists();
        List<String> first = new ArrayList<>();
        first.add("alma");
        first.add("dió");
        first.add("körte");
        first.add("Banán");

        List<String> second = Arrays.asList("banán", "szilva", "Alma");
        List<String> result = new ArrayList<>();
        result.addAll(first);
        result.add("szilva");

        assertEquals(result, stringLists.stringListsUnionIgnoreCase(first, second));

    }
}
