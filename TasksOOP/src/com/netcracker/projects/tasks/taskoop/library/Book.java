package com.netcracker.projects.tasks.taskoop.library;

import com.netcracker.projects.validation.Validation;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && qty == book.qty
                && name.equals(book.name) && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, price, qty);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}
