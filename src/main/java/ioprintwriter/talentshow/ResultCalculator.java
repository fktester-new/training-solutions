package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    private List<Production> productions = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public void readTalents(Path file){
        try(BufferedReader br = Files.newBufferedReader(file)){
            String line;
            while((line =br.readLine()) != null){
                String[] temp = line.split(" ");
                 Production production = new Production(Integer.parseInt(temp[0]), temp[1]);
                 productions.add(production);
            }
        } catch (IOException e){
            throw new IllegalStateException("Can1t read file!", e);
        }
    }

    public void calculateVotes(Path file) {

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                int vote = Integer.parseInt(line);
                addVote(vote);
            }
        } catch(IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }

    public void writeResultToFile(Path file){

        try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))){
            for (Vote v : votes) {
                Production p = findProductionById(v.getId());
                pw.print(v.getId() + " ");
                pw.print(p.getName() + " ");
                pw.println(v.getNumber());

            }
            pw.print("Winner: " + findWinner().getName());

        }catch (IOException e){
            throw new IllegalStateException("Can't write file", e);
        }
    }

    public List<Production> getProductions() {
        return productions;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    private void addVote(int v){
            boolean exists = false;
            for (Vote vote : votes) {
                if (vote.getId() == v){
                    vote.incNum();
                    exists = true;
                }
            }
            if (!exists){
                votes.add(new Vote(v, 1));
            }
    }

    private Production findProductionById(int id){
        for (Production p : productions) {
            if (id == p.getId()){
                return p;
            }
        }
        return null;
    }

    private Production findWinner(){
        int max = votes.get(0).getNumber();
        int maxId = votes.get(0).getId();

        for (Vote v : votes) {
            if (v.getNumber() > max){
                max = v.getNumber();
                maxId = v.getId();
            }
        }
        for (Production p : productions) {
            if (maxId == p.getId()){
                return p;
            }
        }
        return null;
    }

}
