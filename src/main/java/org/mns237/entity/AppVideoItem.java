package org.mns237.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="appVideoItem")
public class AppVideoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name="name")
    String name;
    @Column(name="publishedDate")
    Date publishedDate;
    @Column(name="title")
    String title;
    @Column(name="link")
    String link;
    @Column(name="subtitle")
    String subtitle;
    @Column(name="top")
    String top;

    public AppVideoItem(){  }

    public AppVideoItem(long id, String name){
        this.id = id;
        this.name = name;
    }

    // setter and getter


    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getName() {
        return name;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public String getTop() {
        return top;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
