package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student){
        if (getStudentByNameOrNull(student.getName()) != null){
                return false;
            }
        return students.add(student);
        }

     public boolean removeStudent(Student student){
        Student foundStudent = getStudentByNameOrNull(student.getName());
        if (foundStudent != null){
            students.remove(student);
            return true;
        } else {
            return false;
        }
     }

     public Student findStudentByName(String name){
        if(students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        Student student = getStudentByNameOrNull(name);
        if (student == null){
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return student;
     }

     public double calculateClassAverage() {
         if (students.isEmpty()) {
             throw new ArithmeticException("No student in the class, average calculation aborted!");
         }
         double classAverage = 0;
         int countStudent = 0;

         for (Student s : students) {
             double studentAverage = s.calculateAverage();
             if (studentAverage != 0) {
                 classAverage += studentAverage;
                 countStudent++;
             }
             if (countStudent == 0) {
                 throw new ArithmeticException("No marks present, average calculation aborted!");
             }
         }
         return Math.round(100 * classAverage / countStudent) / 100.0;
     }

     public double calculateClassAverageBySubject(Subject subject){
         if (students.isEmpty()) {
             throw new ArithmeticException("No student in the class, average calculation aborted!");
         }
         double classAverage = 0;
         int countStudent = 0;
         for (Student s: students) {
             double studentAverage = s.calculateSubjectAverage(subject);
             if (studentAverage != 0) {
                 classAverage += studentAverage;
                 countStudent++;
             }
         }
        if (countStudent == 0) {
        throw new ArithmeticException("No marks present, average calculation aborted!");
        }
         return Math.round(100 * classAverage / countStudent) / 100.0;
        }

    public String listStudentNames(){
        StringBuilder result = new StringBuilder();
        for (Student student: students) {
            result.append(student.getName()).append(", ");
        }
        return result.toString().substring(0, result.toString().lastIndexOf(","));
    }

     private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());
    }

    private Student getStudentByNameOrNull(String name) {
        for (Student student: students) {
            if (name.equals(student.getName())){
                return student;
            }
        }
        return null;
    }

    public Student repetition(){
        if (students.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }
        int i = rnd.nextInt(students.size());
        return students.get(i);
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> list = new ArrayList<>();
        for (Student student:students) {
            list.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return list;
    }

}

