package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    public void testMaxValueEntry(){
        Graph graph = new Graph();

        Map<Double, Double> function = new HashMap<>();
        function.put(-2.0, -1.0);
        function.put(-1.0, -7.0);
        function.put(0.0, 1.0);
        function.put(2.0, 0.0);
        function.put(1.0, -0.5);

        Map.Entry<Double, Double> result = graph.maxValueEntry(function);
        assertEquals(0.0, result.getKey());
        assertEquals(1.0, result.getValue());
    }

}