package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public void readGradesFromFile(String fileName){

        Path file = Path.of("src/main/resources/" + fileName);
        try(BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line = br.readLine()) != null){
                String[] temp = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                for (int i = 1; i < temp.length; i++){
                    grades.add(Integer.parseInt(temp[i]));
                }
                Student student = new Student(temp[0], grades);
                students.add(student);
            }
        } catch(IOException ioe){
            throw new IllegalStateException("Can1t read file!", ioe);
        }
    }

    public double classAverage(){
        double sum = 0;
        for (Student student : students) {
            sum += student.average();
        }
        return sum / students.size();
    }

    public List<Student> getStudents() {
        return students;
    }
}
