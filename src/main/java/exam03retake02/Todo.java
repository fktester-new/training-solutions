package exam03retake02;

public class Todo {

    public static final int MINIMUM_PRIORITY = 1;
    public static final int MAXIMUM_PRIORITY = 5;
    private String text;
    private State state = State.NON_COMPLETED;
    private int priority;

    public Todo(String text, int priority) {

        if (priority < MINIMUM_PRIORITY || priority > MAXIMUM_PRIORITY){
            throw new IllegalArgumentException("Invalid priority!");
        }
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    public void complete(){
        state = State.COMPLETED;
    }
}
