package com.greenfox.book;

public class Book {
    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private String publisherCo;
    private Integer releaseYear;

    public Book(String title, String author, String publisherCo, Integer releaseYear) {
        this.id  = nextId++;
        this.title = title;
        this.author = author;
        this.publisherCo = publisherCo;
        this.releaseYear = releaseYear;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisherCo() {
        return publisherCo;
    }

    public void setPublisherCo(String publisherCo) {
        this.publisherCo = publisherCo;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
}