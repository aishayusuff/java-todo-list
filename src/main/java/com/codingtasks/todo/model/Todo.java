package com.codingtasks.todo.model;

public class Todo {
    private Long id;
    private String title;
    private boolean completed;

    //Default construtor
    public Todo() {

    }

    public Todo(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    //Getter and setter for id
    public Long getId() {
        return id;
    } 

    public void setId(Long id){
        this.id = id;
    }

    //Getter and setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //Getter and setter for completed
    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

}
