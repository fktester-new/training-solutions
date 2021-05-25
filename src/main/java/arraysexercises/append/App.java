package arraysexercises.append;

public class App {

    public int[] append(int[] a, int[] b) {
        int n = a.length + b.length;
        int[] result = new int[n];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }
        return result;
    }

}
