package com.netcracker.projects.tasks.taskoop.library;

import com.netcracker.projects.validation.Validation;

public class Book {
    protected String name;
    protected Author[] authors;
    protected double price;
    int qty;

    public Book(String name, Author[] authors, double price) {
        Validation.validate(name);
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        Validation.validate(name);
        for (Author author : authors) {
            Validation.validate(author.name);
        }
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].name);
            authorNames.append((authors.length - i) != 1 ? "," : "");
        }
        Validation.validate(authorNames.toString());
        return authorNames.toString();
    }

    @Override
    public String toString() {
        StringBuilder aBuffer = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            aBuffer.append(authors[i].toString());
            aBuffer.append((authors.length - i) != 1 ? "," : "");
        }
        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + aBuffer.toString() +
                "}, price=" + price +
                ", qty=" + qty +
                ']';
    }

}
