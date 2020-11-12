package intromethods;

import java.util.Arrays;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("Pay bills");
        todoList.addTodo("Meet George");
        todoList.addTodo("Buy eggs");
        todoList.addTodo("Read a book");
        todoList.addTodo("Organize office");

        System.out.println(todoList);
        System.out.println();

        todoList.finishTodos("Pay bills");

        System.out.println(todoList);
        System.out.println();

        todoList.finishAllTodos(Arrays.asList("Buy eggs", "Read a book"));

        System.out.println("Todos to finish: " + todoList.todosToFinish());
        System.out.println("Number of finished todos: " + todoList.numberOfFinishedTodos());
    }
}
