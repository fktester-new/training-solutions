package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("The role of Java constructors", "Solution of Excercise 2");

        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());

        task.start();
        task.setDuration(45);

        System.out.println("The task was started at: "
        + task.getStartDateTime()
        + " and took "
        + task.getDuration()
        + " minutes time.");
    }

}
