package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] parts, Path folder){
        Path file = folder.resolve("image.png");
        try(OutputStream os = new BufferedOutputStream(Files.newOutputStream(file))){
            for(byte[] onePart : parts){
                os.write(onePart);
                }
            }
        catch (IOException e) {
            throw new IllegalStateException("Cannot write file.", e);
        }
    }
}
