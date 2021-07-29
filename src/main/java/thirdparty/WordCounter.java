package thirdparty;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class WordCounter {
    public int numberOfWords(String s){
        if (isEmpty(s)){
            return 0;
        }
        String[] result = s.trim().split("[ .,]+");
        return result.length;
    }

    private boolean isEmpty(String s){
        return s == null || "".equals(s.trim());
    }

    public int numberOfWordsWithGuava(String s){
        return Splitter.on(CharMatcher.anyOf(" ,."))
                .trimResults()
                .omitEmptyStrings()
                .splitToList(s)
                .size();
    }
}
