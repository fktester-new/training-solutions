package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {
    public Temperatures readTemperatures(String pathString) {
        Path file = Path.of(pathString);
        try {
            byte[] data = Files.readAllBytes(file);
            Temperatures temperatures = new Temperatures(data);
            return temperatures;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }
}
