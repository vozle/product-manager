package ru.netology.domain;

public class Book extends Product {
    private String author;

    public Book(int id, String title, int price, String author) {
        super(id, title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return getAuthor().contains(search);
    }
}

