package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public void readStatesFromFile(String fileName){

        Path file = Path.of("src/main/resources/" + fileName);

        try(BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line = br.readLine()) != null){
                String[] state = line.split("-");
                String stateName = state[0];
                String capital = state[1];
                states.add(new State(stateName, capital));
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public String findCapitalByStateName(String stateName){

        for (State state : states) {
            if (state.getStateName().equals(stateName)){
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }
}
