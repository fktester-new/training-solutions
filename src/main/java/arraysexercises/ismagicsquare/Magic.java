package arraysexercises.ismagicsquare;

import java.util.HashSet;
import java.util.Set;

public class Magic {
    public boolean isMagicSquare(int[][] arr){
        if (arr == null || arr.length == 0){
            return false;
        }
        if (! lengthTest(arr)){
            return false;
        }
        Set<Integer> rowSums = new HashSet<>();
        Set<Integer> columnSums = new HashSet<>();
        int firstRow = addRow(arr, 0);
        int firstColumn = addColumn(arr, 0);
        if (firstRow != firstColumn){
            return false;
        }
        rowSums.add(firstRow);
        columnSums.add(firstColumn);
        int columnSumsSize = addAllColumns(arr, columnSums);
        int rowSumsSize = addAllRows(arr, rowSums);
        if (columnSumsSize != 1 || rowSumsSize != 1){
            return false;
        }
        int mainDiagonalSum = calculateMainDiagonalSum(arr);
        if(mainDiagonalSum != firstRow){
            return false;
        }
        int antiDiagonalSum = calculateAntiDiagonalSum(arr);
        return antiDiagonalSum == firstRow;
    }

    private int calculateAntiDiagonalSum(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++){
            sum += arr[j][arr.length - 1 - j];
        }
        return sum;
    }

    private int calculateMainDiagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }

    private int addAllRows(int[][] arr, Set<Integer> rowSums) {
        for (int i = 1; i < arr.length; i++){
            int temp = addRow(arr, i);
            rowSums.add(temp);
        }
        return rowSums.size();
    }

    private int addAllColumns(int[][] arr, Set<Integer> columnSums) {
        for (int j = 1; j< arr[0].length; j++ ){
            int temp = addColumn(arr, j);
            columnSums.add(temp);
        }
        return columnSums.size();
    }



    private int addRow(int[][] arr, int index){
        int sum = 0;
        for (int j = 0; j < arr[index].length; j++) {
            sum += arr[index][j];
        }
        return sum;
    }

    private int addColumn(int[][] arr, int index){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][index];
        }
        return sum;
    }

    private boolean lengthTest(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr.length != arr[i].length){
                return false;
            }
        }
        return true;
    }
}
