package org.mns237.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="photos")
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name="src")
    String src;
    @Column(name="thumbnailImageSrc")
    String thumbnailImage;
    @Column(name="alt")
    String alt;
    @Column(name="publishedDate")
    Date publishedDate;
    @Column(name="summary")
    String summary;

    public Photos(){        }
    public Photos(long id, String summary){
        this.id = id;
        this.summary = summary;
    }

    //setter and getter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public String getAlt() {
        return alt;
    }

    public String getSrc() {
        return src;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }
}
