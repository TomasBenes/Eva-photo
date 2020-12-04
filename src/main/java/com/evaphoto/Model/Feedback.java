package com.evaphoto.Model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_on")
    @CreationTimestamp
    private LocalDateTime createdOn;

    private String title;
    private String content;
    private String userName;
    private Float stars;

    public Feedback() {
    }

    public Feedback(String title, String content, String userName, Float stars) {
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.stars = stars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Float getStars() {
        return stars;
    }

    public void setStars(Float stars) {
        this.stars = stars;
    }
}
