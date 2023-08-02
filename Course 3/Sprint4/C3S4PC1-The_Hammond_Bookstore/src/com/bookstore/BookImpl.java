package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Author author = new Author("Mim","Fulgor Nocturnus");
        System.out.println(author);
        Book book = new Book(823567,"Once in my dream","Adventurous, horrible, tremendous",700.0,author);
        book.displayBookDetails();
    }
}
