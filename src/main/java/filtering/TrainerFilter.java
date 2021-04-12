package filtering;

import java.util.ArrayList;
import java.util.List;

public class TrainerFilter {

    public List<Trainer> filterByName(List<Trainer> trainers, String part){
        List<Trainer> filteredTrainer = new ArrayList<>();
        for (Trainer trainer : trainers) {
            if (trainer.getName().contains(part)){
                filteredTrainer.add(trainer);
            }
        }
        return filteredTrainer;
    }
}
