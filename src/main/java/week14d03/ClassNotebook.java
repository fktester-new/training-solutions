package week14d03;

import java.util.*;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook(){
        //List<Student> result = new ArrayList<>(students);
        //így még beleírhatunk a naplóba, ld. 32. sor
        // Biztonságosabb a tanulók másolati példányait egyesével átadni.
        List<Student> result = new ArrayList<>();
        for (Student s : students){
            result.add(new Student(s));
        }
        Collections.sort(result);
        return result;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public static void main(String[] args) {
        ClassNotebook cnb = new ClassNotebook(new ArrayList<>(List.of(new Student("John"), new Student("Bill"), new Student("Jane"))));

        cnb.sortNotebook().get(1).addNote("math", 5);
        System.out.println(cnb.getStudents());
        System.out.println(cnb.sortNotebook());
        System.out.println(cnb.getStudents());
    }
}
