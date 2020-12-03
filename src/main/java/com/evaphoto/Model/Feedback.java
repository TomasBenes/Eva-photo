package com.evaphoto.Model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(name = "current_date")
    private DateFormat currentDate;

    private String title;
    private String content;
    private String userName;
    private Float stars;

    public Feedback() {
    }

    public Feedback(String title, String content, String userName, Float stars, DateFormat currentDate) {
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.stars = stars;
        this.currentDate = currentDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DateFormat getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(DateFormat currentDate) {
        this.currentDate = currentDate;
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
