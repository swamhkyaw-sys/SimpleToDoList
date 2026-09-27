package org.example;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<Task>();
    }

    public void add(String name) {
        Task task = new Task(name);
        tasks.add(task);
    }

    public void complete(String name) {
        for ( Task task : tasks ) {
            if ( task.getName().equals(name) ) {
                task.complete();
                return;
            }
        }
    }

    public ArrayList<String> all() {
        ArrayList<String> result = new ArrayList<String>();

        for ( Task task : tasks ) {
            result.add(task.getName());
        }

        return result;
    }

    public ArrayList<String> complete() {
        ArrayList<String> result = new ArrayList<String>();

        for ( Task task : tasks ) {
            if ( task.isComplete() ) {
                result.add(task.getName());
            }
        }

        return result;
    }

    public ArrayList<String> incomplete() {
        ArrayList<String> result = new ArrayList<String>();

        for ( Task task : tasks ) {
            if ( !task.isComplete() ) {
                result.add(task.getName());
            }
        }

        return result;
    }

    public void clear() {
        tasks.clear();
    }
}