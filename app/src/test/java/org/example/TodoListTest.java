package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;


public class TodoListTest {
    @Test
    void testEmptyList() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        assertEquals(expected , todo.all());
    }

    @Test
    void testAddOneTask() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        expected.add("Homework");

        assertEquals(expected , todo.all());
    }

    @Test
    void testAddMultipleTasks() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.add("Laundry");
        todo.add("Study");

        expected.add("Homework");
        expected.add("Laundry");
        expected.add("Study");

        assertEquals(expected , todo.all());
    }

    @Test
    void testCompleteTask() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.complete("Homework");

        expected.add("Homework");

        assertEquals(expected , todo.complete());
    }

    @Test
    void testIncompleteTask() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.add("Laundry");
        todo.complete("Homework");

        expected.add("Laundry");

        assertEquals(expected , todo.incomplete());
    }

    @Test
    void testAllAfterComplete() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.add("Laundry");
        todo.complete("Homework");

        expected.add("Homework");
        expected.add("Laundry");

        assertEquals(expected , todo.all());
    }

    @Test
    void testCompleteTaskThatDoesNotExist() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.complete("Not Here");

        assertEquals(expected , todo.complete());
    }

    @Test
    void testClear() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.add("Laundry");

        todo.clear();

        assertEquals(expected , todo.all());
    }

    @Test
    void testClearCompleteTasks() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.add("Homework");
        todo.complete("Homework");

        todo.clear();

        assertEquals(expected , todo.complete());
    }

    @Test
    void testClearEmptyList() {
        TodoList todo = new TodoList();
        ArrayList<String> expected = new ArrayList<String>();

        todo.clear();

        assertEquals(expected , todo.all());
    }
}