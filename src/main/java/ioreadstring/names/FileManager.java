package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private List<Human> humans = new ArrayList<>();
    private Path myFile;

    public FileManager(String fileRelativePath){
        this.myFile = Path.of(fileRelativePath);
    }

    public List<Human> getHumans() {

        return new ArrayList<>(humans);
    }

    public Path getMyFile() {
        return myFile;
    }

    public void readFromFile(){

        try {
            List<String> people = Files.readAllLines(myFile);
                for (String s : people) {
                String[] man = s.split(" ");
                Human human = new Human(man[0], man[1]);
                humans.add(human);
            }
        } catch(IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
