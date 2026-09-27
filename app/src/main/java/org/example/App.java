package org.example;
public class App {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        System.out.println("Todo List Program");

        todo.add("Finish homework");
        todo.add("Do laundry");
        todo.add("Study Java");

        System.out.println();
        System.out.println("All Tasks:");
        System.out.println(todo.all());

        todo.complete("Finish homework");

        System.out.println();
        System.out.println("Completed Tasks:");
        System.out.println(todo.complete());

        System.out.println();
        System.out.println("Incomplete Tasks:");
        System.out.println(todo.incomplete());

        todo.complete("This task does not exist");

        System.out.println();
        System.out.println("After trying an invalid task:");
        System.out.println(todo.all());

        todo.clear();

        System.out.println();
        System.out.println("After clearing:");
        System.out.println(todo.all());
    }
}