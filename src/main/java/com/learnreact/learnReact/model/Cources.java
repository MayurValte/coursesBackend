package com.learnreact.learnReact.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cources {
    @Id
    private int id;
    private String title;
    private String description;

    public Cources(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Cources( String title, String description) {
        this.title = title;
        this.description = description;
    }
    public Cources() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
