package org.mns237.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="videos")
public class Videos {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
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
	
	@JoinColumn(name="comment_id")
	private long commentId;

    public Videos(){  }

    public Videos(long id, String name){
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
}
