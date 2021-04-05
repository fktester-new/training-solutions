package iodatastream.statistics;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path file){
        try(DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))) {
       os.writeInt(heights.size());
            for (int i : heights) {
                os.writeInt(i);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file!", e);
        }

    }
}
