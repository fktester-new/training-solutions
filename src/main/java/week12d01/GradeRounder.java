package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        if (grades == null || grades.length == 0){
            throw new IllegalArgumentException("The array is empty or null.");
        }
        int next = 0;

        for (int j = 0; j < grades.length; j++) {
            if (grades[j] > 40) {

                next = nextMultipleOfFive(grades[j]);
                if (next - grades[j] < 3) {
                    grades[j] = next;
                }
            }
        }
        return grades;
    }


    private int nextMultipleOfFive(int n){
        int multiple = 0;
        for (int i = n; i < n + 5; i++) {
            if (i % 5 == 0){
                multiple = i;
            }
        }
        return multiple;
    }

    public int[] roundGradesOther(int[] grades){
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > 40){
                int floor = grades[i] / 5;
                int next = (floor + 1) * 5;
                if (next - grades[i] < 3){
                    grades[i] = next;
                }
            }
        }
        return grades;
    }
}
