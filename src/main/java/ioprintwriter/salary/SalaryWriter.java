package ioprintwriter.salary;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> employees;

    public SalaryWriter(List<String> employees) {
        this.employees = employees;
    }

    public void writeNamesAndSalaries(Path file){

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))){
            for(String name : employees ){
                int salary = calculateSalary(name);
                writer.print(name);
                writer.print(": ");
                writer.println(salary);
            }
        }catch(IOException e){
            throw new IllegalStateException("Can't write file!", e);
        }
    }

    private int calculateSalary(String str){
        if (str.startsWith("Dr")){
            return 500000;
        } else{
            if(str.startsWith("Mr") || str.startsWith("Mrs")){
                return 200000;
            }
           return 100000;
        }
    }
}
