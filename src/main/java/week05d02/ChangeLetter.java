package week05d02;

public class ChangeLetter {

  public final static String VOWELS = "aeiou";
  public final static String ALL_VOWELS = "aeiouAEIOU";

    public String changeVowels(String txt) {
        txt = txt.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            String c = txt.substring(i, i+1);
            if (VOWELS.contains(c)) {
                result.append("*");
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String changeVowelsCaseSensitive(String txt) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            String c = txt.substring(i, i+1);
            if (ALL_VOWELS.contains(c)) {
                result.append("*");
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
