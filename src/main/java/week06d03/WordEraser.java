package week06d03;

import java.util.Scanner;

public class WordEraser {


   public String eraseWord(String words, String word) {
       String[] separatedWords = words.split(" ");
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < separatedWords.length; i++) {
           if (!word.equals(separatedWords[i])) {
               result.append(separatedWords[i] + " ");
           }

       }
       return result.toString().trim();
   }

   public String eraseWordWithScanner(String words, String word){
       Scanner scanner = new Scanner(words).useDelimiter(" ");
       StringBuilder result = new StringBuilder();

       while(scanner.hasNext()) {
           String str = scanner.next();
           if (!word.equals(str)){
               result.append(str).append(" ");
           }
       }
       return result.toString().trim();
   }
}
