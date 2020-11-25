package controlselection.accents;

public class WithoutAccents {

    public static final String WITH_ACCENTS = "áÁéÉíÍóÓöÖőŐúÚüÜűŰ";
    public static final String WITHOUT_ACCENTS = "aAeEiIoOoOoOuUuUuU";

    public char convertToCharWithoutAccents(char c) {
        int index = WITH_ACCENTS.indexOf(c);
        if (index >= 0) {
            return WITHOUT_ACCENTS.charAt(index);
        } else {
            return c;
        }
    }
}
