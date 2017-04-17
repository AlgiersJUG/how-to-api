package com.example.service;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/14/17.
 */

public class TodoDto {

    private Long id;
    private String title;
    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
