package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void writeLongWords(Writer writer, List<String> words){
        PrintWriter pw = new PrintWriter(writer);
        for (String word : words) {
            pw.print(word);
            pw.print(":");
            pw.println(word.length());

        }
    }

    public String writeWithStringWriter(List<String> words){
        try(StringWriter sw = new StringWriter()){
            writeLongWords(sw, words);
            return sw.toString();
        }catch (IOException e){
            throw new IllegalStateException("Can't write file!", e);
        }
    }
}
