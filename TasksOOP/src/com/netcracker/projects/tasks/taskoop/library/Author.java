package com.netcracker.projects.tasks.taskoop.library;

public class Author {
    protected String name;
    protected String email;
    protected char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, char gender) {
        this.name = name;
        this.gender =gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ']';
    }
}
