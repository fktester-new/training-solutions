package ioreadbytes.bytematrix;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    private List<byte[]> myMatrix = new ArrayList<>();


    public void readBytesAndCreateMatrix(String fileName) {
        Path file = Path.of(fileName);
        try(InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))){
            byte[] bytes = new byte[1000];
            int size;
            while((size = inputStream.read(bytes)) > 0){
                myMatrix.add(bytes);
            }
        } catch(IOException e){
            throw new IllegalStateException("Can't read file!", e);
        }
    }


    public int numberOfColumnsWhereMoreZeros() {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < myMatrix.size(); j++){
                if (myMatrix.get(j)[i] == 48){
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (zeros > ones){
                result++;
            }
        }
        return result;
    }

    public List<byte[]> getMyMatrix() {
        return myMatrix;
    }
}
