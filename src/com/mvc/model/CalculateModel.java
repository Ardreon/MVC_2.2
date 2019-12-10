package com.mvc.model;

public class CalculateModel {

    private String title;
    private String author;
    private String publishing_house;
    private int year;
    private int number_of_pages;
    private int price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public int getYear() {
        return year;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   /*   public CalculateModel(String title, String author, String publishing_house, int year, int number_of_pages, int price) {
        this.title = title;
 /*       this.author = author;
        this.publishing_house = publishing_house;
        this.year = year;
        this.number_of_pages = number_of_pages;
        this.price = price;


    }
    */
}
