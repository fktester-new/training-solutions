package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    TemplateMerger tm = new TemplateMerger();
    Employee e1 = new Employee("John Doe", 1980);
    Employee e2 = new Employee("Jack Doe", 1990);
    Employee e3 = new Employee("Jane Doe", 1995);
    Employee e4 = new Employee("Ann Doe", 1986);

    List<Employee> employees = List.of(e1, e2, e3, e4);

    @Test
    public void testLoadTemplate(){
        Path file = Path.of("src/main/java/week13d04/template.txt");

        assertEquals("Az alkalmazott neve: {nev}, születési éve: {ev}", tm.loadTemplate(file));
    }

    @Test
    public void testMerge(){

        Path file = Path.of("src/main/java/week13d04/template.txt");
        String result = tm.merge(file, employees);

        assertEquals("Az alkalmazott neve: Jack Doe, születési éve: 1990", result.substring(51, 101));
        assertEquals("Az alkalmazott neve: Ann Doe, születési éve: 1986\n", result.substring(153));
    }

}