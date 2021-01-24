package course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        if (name == null){
            throw new IllegalArgumentException("The name is null");
        }
        this.name = name;
        if (begin == null){
            throw new IllegalArgumentException("The time is null");
        }
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

  @Override
    public String toString() {
        return String.format("%02d:%02d", begin.getHour(), begin.getMinute()) + ": " + name;
    }
}
