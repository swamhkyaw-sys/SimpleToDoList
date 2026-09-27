package org.example;
public class Task {

    private String name;
    private boolean complete;

    public Task(String name) {
        this.name = name;
        complete = false;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return complete;
    }

    public void complete() {
        complete = true;
    }
}