package com.netcracker.projects.tasks.taskoop;

import com.netcracker.projects.tasks.taskoop.library.Author;
import com.netcracker.projects.tasks.taskoop.library.Book;

//Example work with methods class Book
public class MainLibrary {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        Author author = new Author("Harry Lennon", "Lennon@yandex.ru", 'm');
        Author author2 = new Author("Lina Ken", "Ken@gmail.com", 'f');
        authors[0] = author;
        authors[1] = author2;

        Book book = new Book("World around us", authors, 500);
        outputInfoAboutBook(book);
    }

    static void outputInfoAboutBook(Book book) {
        System.out.println("Output information about book: " + book.toString());
        System.out.println("Get author name from book : " + book.getAuthorNames());
    }
}
