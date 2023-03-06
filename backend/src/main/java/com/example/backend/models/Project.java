package com.example.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projectData")
public class Project {
    @Id
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private String githubURL;
    @Column
    private String liveURL;

    public Project() {
    }

    public Project(int id, String title, String description, String image, String githubURL, String liveURL) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.githubURL = githubURL;
        this.liveURL = liveURL;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGithubURL() {
        return githubURL;
    }

    public void setGithubURL(String githubURL) {
        this.githubURL = githubURL;
    }

    public String getLiveURL() {
        return liveURL;
    }

    public void setLiveURL(String liveURL) {
        this.liveURL = liveURL;
    }
}
