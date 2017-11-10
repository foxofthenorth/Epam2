package com.company;

public class Library {
    private String name;
    private String author;
    private String publisher;
    private int publ_year;
    private int pages;
    private double price;

    public Library(String name, String author, String publ_house, int publ_year, int pages, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publ_house;
        this.publ_year = publ_year;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPubl_year() {
        return publ_year;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "Name: " +getName() + " Author: " + getAuthor() + " Publisher: " + getPublisher() + " Publ. year: "
                + getPubl_year() + " Count of pages: " + getPages() + " Price: " + getPrice();
    }
}
