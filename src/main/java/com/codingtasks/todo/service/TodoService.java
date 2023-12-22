package com.codingtasks.todo.service;

import com.codingtasks.todo.model.Todo;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;



public class TodoService {
    //Todo in-memory list
    private List<Todo> todos = new ArrayList<>();
    
    //Generate id for each todo. can also use UUID
    Long nextID = 1L;

    //Creates a new todo
    public Todo createTodo(Todo todo) {
        todo.setId(nextID++);
        todos.add(todo);
        return todo;
    }

    //Gets all todos
    public List<Todo> getAllTodos() {
        return todos;
    }

    //Updates a todo
    public Todo updatesTodo(Long id, Todo updatedTodo){
        Optional<Todo> todoOptional = findTodoByID(id);

        if(todoOptional.isPresent()) {
            Todo existingTodo = todoOptional.get();
            existingTodo.setTitle(updatedTodo.getTitle());
            existingTodo.setCompleted(updatedTodo.getCompleted());
            return existingTodo;
        } else {
            throw new NoSuchElementException("Todo with id " + id + " not found");
        }
    }
    //Deletes a todo

    public void deletesTodo(Long id){
        todos.removeIf(todo -> todo.getId().equals(id));
    }

    //Helper class
    private Optional<Todo> findTodoByID(Long id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst();
    }


}
