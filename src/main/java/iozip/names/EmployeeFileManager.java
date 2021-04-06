package iozip.names;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {

    public void saveEmployees(Path file, List<String> employees) {
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))) {
            zos.putNextEntry(new ZipEntry("names.dat"));
            for (String s : employees) {
                zos.write(s.getBytes());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write into zip", e);
        }
    }
}
