package com.fabiofrau.ControllerCompleto.dto;


public class Book {

    private Integer id;
    private String title;
    private String author;
    private String editor;
    private Integer pubYear;

    public Book(Integer id, String title, String author, String editor, Integer pubYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pubYear = pubYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getPubYear() {
        return pubYear;
    }

    public void setPubYear(Integer pubYear) {
        this.pubYear = pubYear;
    }
}
