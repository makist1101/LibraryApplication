package io.vertx.intro.first;


import io.vertx.core.json.JsonObject;

public class Book {

    private long id = -1;

    private String title;

    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book() {
        
    }

    public Book(JsonObject json) {
        this(
            json.getInteger("id", -1),
            json.getString("title"),
            json.getString("author")
        );
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }
}
