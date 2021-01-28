package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {

        String template = loadTemplate(file);
        return createString(template, employees);
    }

    private String createString(String temp, List<Employee> list){
        StringBuilder str = new StringBuilder();
        for (Employee employee : list) {
            String name = employee.getName();
            String year = String.valueOf(employee.getYearOfBirth());
            String result = temp.replace("{nev}", name).replace("{ev}", year);
            str.append(result).append("\n");
        }
        return str.toString();
    }

    String loadTemplate(Path file){

        String template;
        try (BufferedReader br = Files.newBufferedReader(file)) {
            template = br.readLine();
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return template;
    }
}