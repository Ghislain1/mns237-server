package org.mns237.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="videos")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name="year")
    float year;
    @Column(name="subtitle")
    String subtitle;
    @Column(name="publishedDate")
    Date publishedDate;

    @Column(name="name")
    String name;
    @Column(name="likeButton")
    float likeButton;
    @Column(name="unlikeButton")
    float unlikeButton;

    @JoinColumn(name="comments_id")
    private long commentsId;

    @Column(name="link")
    private String link;
    @Column(name="title")
    private String title;

    public Items(){  }

    public Items(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Date getPublishedDate() {
        return publishedDate;
    }


    public float getLikeButton() {
        return likeButton;
    }

    public float getYear() {
        return year;
    }

    public float getUnlikeButton() {
        return unlikeButton;
    }

    public String getName() {
        return name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setLikeButton(float likeButton) {
        this.likeButton = likeButton;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setUnlikeButton(float unlikeButton) {
        this.unlikeButton = unlikeButton;
    }

    public void setYear(float year) {
        this.year = year;
    }

    public long getCommentsId() {
        return commentsId;
    }

    public String getLink() {
        return link;
    }

    public void setCommentsId(long commentsId) {
        this.commentsId = commentsId;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
