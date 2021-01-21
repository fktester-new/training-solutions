package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteDecoder {

    public String printSecret(Path path) {
        StringBuilder sb = new StringBuilder();

        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                sb.append(c);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb.toString();
    }

    public String printSecretNewWay(Path path){
        StringBuilder sb = new StringBuilder();
        try (InputStream is = Files.newInputStream(path)){
            byte[] buffer = new byte[1000];
            int size;
            while((size = is.read(buffer)) > 0){
                for (int i = 0; i < size; i++){
                    char c = (char) (buffer[i] + 10);
                    sb.append(c);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return sb.toString();
    }

    public void printSecretToFile(Path source, Path destination){
        try(InputStream is = Files.newInputStream(source); OutputStream os = Files.newOutputStream(destination)){
            byte[] buffer = new byte[10];
            int size;
            while((size = is.read(buffer)) > 0){
                //System.out.println(size);
                for (int i = 0; i < size; i++){
                    char c = (char) (buffer[i] + 10);
                    os.write(c);
                }
            }

        } catch (IOException ioe){
            throw new IllegalStateException("Can not read or write file", ioe);
        }
    }

    public static void main(String[] args) {
        String result = new ByteDecoder().printSecret(Path.of("secret.dat"));
        System.out.println(result);

        String newResult = new ByteDecoder().printSecretNewWay(Path.of("secret.dat"));
        System.out.println(newResult);

        new ByteDecoder().printSecretToFile(Path.of("secret.dat"), Path.of("result.txt"));
    }
}
