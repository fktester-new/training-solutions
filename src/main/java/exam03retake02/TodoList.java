package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo todo){
        todos.add(todo);
    }

    public int getNumberOfItemsLeft(){
        int count = 0;
        for (Todo todo : todos) {
            if(todo.getState() == State.NON_COMPLETED){
                count++;
            }
        }
        return count;
    }

    public List<String> getMostImportantTodosText() {
        int maxPriority = 5;
        List<String> texts = new ArrayList<>();

        for (Todo todo : todos) {
            if (todo.getPriority() < maxPriority){
                maxPriority = todo.getPriority();
                texts.clear();
                texts.add(todo.getText());
            }
            else if(todo.getPriority() == maxPriority){
                texts.add(todo.getText());
            }
        }
        return texts;
    }

    public void deleteCompleted(){
        List<Todo> toDel = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getState() == State.COMPLETED){
                toDel.add(todo);
            }
        }
        todos.removeAll(toDel);
    }
}
