package school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int mark){

        try{
            if (Files.exists(file)){
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);

            } else {
                Files.writeString(file, Double.toString(mark));
            }
        } catch (IOException e){
            throw new IllegalStateException("Can't write file", e);
        }
    }

    public void average(Path file) {
        double sum = 0;
        List<String> marks;
        try {
            marks = Files.readAllLines(file);

            for (String mark : marks) {
                sum += Double.parseDouble(mark);
            }
            double average =  sum / marks.size();
            Files.writeString(file, "average: " + average, StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}
