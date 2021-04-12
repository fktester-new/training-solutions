package transformations;

import java.util.ArrayList;
import java.util.List;

public class Transformations {

    public List<String> toNames(List<Trainer> trainers){
        List<String> names = new ArrayList<>();
        for(Trainer trainer : trainers){
            names.add(trainer.getName());
        }
        return names;
    }

    public List<String> toNamesYearOfBirthBefore(List<Trainer> trainers, int year){
        List<String> names = new ArrayList<>();
        for (Trainer t : trainers) {
            if (t.getYearOfBirth() < year){
                names.add(t.getName());
            }
        }
        return names;
    }
}
