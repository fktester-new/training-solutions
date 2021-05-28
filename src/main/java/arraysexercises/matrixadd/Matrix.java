package arraysexercises.matrixadd;

public class Matrix {
    public int[][] matrixAdd(int[][] a, int[][] b){
        if (a.length != b.length){
            throw new IllegalArgumentException("Cannot add elements because of different size");
        }
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
