package com.bookstore;

public class Book {
    private int isbnNumber;
    private String title;
    private String description;
    private double price;
    Author author;


    public Book(int isbnNumber, String title, String description, double price, Author author) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookDetails()
    {
        System.out.println("Book Details : ");
        System.out.println("ISBN Number of Book : "+getIsbnNumber());
        System.out.println("Title of the Book : "+getTitle());
        System.out.println("Description of Book :"+getDescription());
        System.out.println("Price of Book : "+getPrice());
        System.out.println("Author name : "+getAuthor().getAuthorName());
        System.out.println("Author Pen Name : "+getAuthor().getAuthorPenName());
    }
}
