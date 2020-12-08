package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }
    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if (results == null || results.length == 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int numberOfTop = 0;
        for (int point: results) {
            if (point > maxPoints * (limitInPercent/ 100.0)){
                numberOfTop++;
            }
        }
        return numberOfTop;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if (results == null || results.length == 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (int point: results) {
            if (point < maxPoints * (limitInPercent/ 100.0)){
                return true;
            }
        }
        return false;
    }
}
