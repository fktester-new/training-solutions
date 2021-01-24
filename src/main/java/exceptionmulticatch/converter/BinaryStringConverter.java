package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str){
        if (str == null){
            throw new NullPointerException("inputString is null");
        }
        boolean[] bool = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
          if (c == '0') {
              bool[i] = false;
          }else if(c == '1'){
              bool[i] = true;
          }else {
              throw new IllegalArgumentException("Invalid input parameters");
          }
        }
        return bool;
    }

    public String booleanArrayToBinaryString(boolean[] bool){
        if (bool == null){
            throw new NullPointerException("The array is null");
        }
        if (bool.length == 0){
            throw new IllegalArgumentException("Invalid input parameters");
        }
        StringBuilder sb = new StringBuilder();
        for (boolean b : bool) {
            if(b == true){
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
