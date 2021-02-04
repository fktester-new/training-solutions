package ioreadbytes.byteacount;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        Path file = Path.of(fileName);
        int count = 0;
        try (InputStream inputStream = Files.newInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
                for (byte b : bytes) {
                if (b == 97) {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read bytes!", e);
        }
        return count;
    }
}
