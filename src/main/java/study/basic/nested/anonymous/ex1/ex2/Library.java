package study.basic.nested.anonymous.ex1.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Library {
    List<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author){
        books.add(new Book(title, author));
    }

    public void printBooks(){
        for (Book book: books) {
            book.printInfo();
        }
    }

    private static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void printInfo(){
            System.out.println("title : "+title + " / author : "+author);
        }

    }

}
