package week14d03;

import java.util.*;

public class Student implements Comparable<Student>{

    private String studentName;
    private Map<String, List<Integer>> notes = new HashMap<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(Student s) {
        studentName = s.studentName;
        notes = new HashMap<>(s.notes);
    }

    public void addNote(String subject, int note){
        if(!notes.containsKey(subject)){
                notes.put(subject, new ArrayList<>());
            }
        notes.get(subject).add(note);
        }

    public String getStudentName() {
        return studentName;
    }

    public Map<String, List<Integer>> getNotes() {
        return notes;
    }

    @Override
    public int compareTo(Student o) {
        return studentName.compareTo(o.studentName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", notes=" + notes +
                '}';
    }
}
