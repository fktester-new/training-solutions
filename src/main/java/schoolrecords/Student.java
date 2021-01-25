package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

   private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage(){
        if (marks.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Mark mark:marks) {
            sum += mark.getMarkType().getValue();
        }
        double avgTotal = sum / marks.size();
        return Math.round(100 * avgTotal) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject){
        if (marks.isEmpty()){
            return 0;
        }
        double sum = 0;
        int count = 0;

        for (Mark mark: marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())){
                count++;
                sum += mark.getMarkType().getValue();
            }
        }
        if(count == 0){
            return 0;
        }
        double avg = sum / count;
        return Math.round(100 * avg) / 100.0;
    }

    public void grading(Mark mark){
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());
    }

    public String toString(){
        String temp = name + " marks: ";
        for (Mark mark: marks) {
            temp += mark.getSubject().getSubjectName() + ": " + mark.toString() + " ";
        }
        return temp.toString().trim();
    }
}
