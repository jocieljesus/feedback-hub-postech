package com.fiap.models;

public class Feedback {
    private Long id;
    private String description;
    private int note;

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
