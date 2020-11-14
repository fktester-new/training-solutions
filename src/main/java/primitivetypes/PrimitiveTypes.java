package primitivetypes;

public class PrimitiveTypes {

    public static final int MAX_NUMBER_OF_BITS = 32;
// Csak nem negatív számokra működik jól.
    public String toBinaryString(int n) {
      String s = "";
      for (int number = Math.abs(n); n > 0;) {
          int bit = n % 2;
          s = bit + s;
          n = n / 2;
      }

      int zeros = MAX_NUMBER_OF_BITS - s.length();
      for (int i = 0; i < zeros; i++) {
          s = 0 + s;
      }
      return s;
    }
}
