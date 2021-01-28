package week13d03;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeacherStatistics {

    private List<Teacher> data = new ArrayList<>();

    public void readFromFile(String fileName){

        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))){

            String[] block = new String[4];
            while((block[0] = br.readLine()) !=null){
               data.add(processBlock(br, block));
            }
        } catch ( IOException e){
            throw new IllegalArgumentException("Wrong file", e);
        }
    }

    private Teacher processBlock(BufferedReader br, String[] block) throws IOException {
        for (int i = 1; i < 4; i++){
            block[i] = br.readLine();
        }
        return new Teacher(block[0], block[1], block[2],Integer.parseInt(block[3]));
    }

    public int weeklyWork(String name){

        int sumHours = 0;
        for (Teacher t: data) {
            if (name.equals(t.getName())){
                sumHours += t.getNumberOfLessons();
            }
        }
        return sumHours;
    }

    public List<Teacher> getData() {
        return data;
    }

    public  int sumLessonsOfTeacherFromFile(String file, String teacherName){

        int sum = 0;
        try(BufferedReader br = Files.newBufferedReader(Path.of(file))){
            String line;
            while((line = br.readLine()) != null){
                if (line.equals(teacherName)){
                    skipTwoLines(br);
                    sum += Integer.parseInt(br.readLine());
                }
            }
        } catch (IOException e){
            throw new IllegalArgumentException("Wrong file", e);
        }
        return sum;
    }

    private void skipTwoLines(BufferedReader br) throws IOException {
        br.readLine();
        br.readLine();
    }
}
