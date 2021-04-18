/* package org.mns237.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // variables declaration
    @Column(name = "content")
    private String content;

    @Column(name ="createdDate")
    private Date createdDate;

    @Column(name ="publishedDate")
    private Date publishedDate;

    @Column(name ="title")
    private String title;

    @Column(name ="updatedDate")
    private Date updatedDate;

    @Column(name="summary")
    private String summary;

    @Column(name ="imageUrl")
    private String imageUrl;

    @Column(name="rating")
    private String rating;

    @Column(name ="category")
    private String category;

    @Column(name="like")
    private String like;

    @Column(name ="unlike")
    private String unlike;

    @Column(name="verified")
    private boolean verified;

    @Column(name="comments")
    private Comment[] comments;

    // default constructor
    public Topic(){

    }

    public Topic(long id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // getter and setter methods
    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }
    public Date getCreatedDate(){
        return createdDate;
    }

    public void setPublishedDate(Date publishedDate){
        this.publishedDate = publishedDate;
    }
    public Date getPublishedDate(){
        return publishedDate;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setUpdatedDate(Date updatedDate){
        this.updatedDate = updatedDate;
    }
    public Date getUpdatedDate(){
        return updatedDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getUnlike() {
        return unlike;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setUnlike(String unlike) {
        this.unlike = unlike;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
} */
