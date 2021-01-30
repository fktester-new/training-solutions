package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void writeBandsBefore(Path targetFile, int year){

        try(BufferedWriter bw = Files.newBufferedWriter(targetFile)){
            List<Band> result = olderThan(year);
            for (Band b : result) {
                bw.write(b.getName() + " " + b.getYear() + "\n");
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file!", ioe);
        }
    }


    public void readBandsFromFile(Path file) {

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            bands = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                Band band = new Band(temp[0], Integer.parseInt(temp[1]));
                bands.add(band);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    private List<Band> olderThan(int year){
        List<Band> result = new ArrayList<>();
        for (Band band: bands){
            if (band.getYear() < year){
                result.add(band);
            }
        }
        return result;
    }
}
