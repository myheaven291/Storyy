package com.example.huy.storyy.databases;

/**
 * Created by Huy on 6/17/2017.
 */

public class StoryModel {
    private int id;
    private String image;
    private String tittle;
    private String description;
    private String content;
    private String author;
    private boolean bookmark;

    public StoryModel(int id, String image, String tittle, String description, String content, String author, boolean bookmark) {
        this.id = id;
        this.image = image;
        this.tittle = tittle;
        this.description = description;
        this.content = content;
        this.author = author;
        this.bookmark = bookmark;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBookmark() {
        return bookmark;
    }

    @Override
    public String toString() {
        return "StoryModel{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", bookmark=" + bookmark +
                '}';
    }
}
